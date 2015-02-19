package net.sf.psstools.lang.ui.views;

import java.util.Stack;

import org.eclipse.jface.text.TextPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

public class TextPresentationStringBuilder {
	private StringBuilder					fSB;
	private TextPresentation				fPresentation;
	private int 							fLastRegionEnd;
	private Stack<Font>						fFontStack;
	private Stack<Color>					fColorStack;
	
	private int								fTextStyle = 0;
	
	private int								fBold = 0;
	private int								fItalic = 0;
	private int								fStrikeout = 0;
	
	private static final int BOLD			= 1;
	private static final int ITALIC			= 2;
	private static final int STRIKEOUT		= 4;
	
	public TextPresentationStringBuilder() {
		fSB = new StringBuilder();
		fPresentation = new TextPresentation();
		fFontStack = new Stack<Font>();
		fColorStack = new Stack<Color>();
	}
	
	public TextPresentation presentation() {
		return fPresentation;
	}
	
	public void insertWS() {
		if (fSB.length() > 0 && !Character.isWhitespace(fSB.charAt(fSB.length()-1))) {
			fSB.append(' ');
		}
	}
	
	public int length() {
		return fSB.length();
	}
	
	public void append(char c) {
		fSB.append(c);
	}
	
	public void append(String s) {
		fSB.append(s);
	}
	
	public String toString() {
		return fSB.toString();
	}
	
	public void keyword(String kw) {
		setTextAttr(BOLD);
		setColor(SWT.COLOR_RED);
		fSB.append(kw);
		clrColor();
		clrTextAttr(BOLD);
	}

	public void setTextAttr(int attr) {
		int old_style = fTextStyle;
		
		if ((attr & BOLD) != 0) {
			fBold++;
		}
		if ((attr & ITALIC) != 0) {
			fItalic++;
		}
		if ((attr & STRIKEOUT) != 0) {
			fStrikeout++;
		}
	
		fTextStyle = 
				((fBold>0)?BOLD:0) +
				((fItalic>0)?ITALIC:0) +
				((fStrikeout>0)?STRIKEOUT:0);
		
		if (old_style != fTextStyle && fSB.length() != fLastRegionEnd) {
			applyStyleRegion(old_style, currFont(), currColor());
		}
	}

	public void clrTextAttr(int attr) {
		int old_style = fTextStyle;
		
		if ((attr & BOLD) != 0 && fBold > 0) {
			fBold--;
		}
		if ((attr & ITALIC) != 0 && fItalic > 0) {
			fItalic--;
		}
		if ((attr & STRIKEOUT) != 0 && fStrikeout > 0) {
			fStrikeout--;
		}
	
		fTextStyle = 
				((fBold>0)?BOLD:0) +
				((fItalic>0)?ITALIC:0) +
				((fStrikeout>0)?STRIKEOUT:0);
		
		if (old_style != fTextStyle && fSB.length() != fLastRegionEnd) {
			applyStyleRegion(old_style, currFont(), currColor());
		}
	}
	
	private void applyStyleRegion(int style, Font font, Color color) {
		int offset = fLastRegionEnd;
		int length = (fSB.length()-fLastRegionEnd);
		
		if (offset >= 0 && length > 0) {
			StyleRange range = new StyleRange(offset, length, null, null);
			if ((style & BOLD) != 0) {
				range.fontStyle += SWT.BOLD;
			}
			if ((style & ITALIC) != 0) {
				range.fontStyle += SWT.ITALIC;
			}
			if ((style & STRIKEOUT) != 0) {
				range.strikeout = true;
			}
			
			if (font != null) {
				range.font = font;
			}
			if (color != null) {
				range.foreground = color;
			}
			
			fPresentation.addStyleRange(range);
		}
		fLastRegionEnd = fSB.length();
	}
	
	private Font currFont() {
		if (fFontStack.size() > 0) {
			return fFontStack.peek();
		} else {
			return null;
		}
	}
	
	
	private void setColor(int color) {
		Display d = Display.getCurrent();
		Color c = d.getSystemColor(color);
	
		Color old_color = currColor();
		fColorStack.push(c);

		if (old_color != c && fSB.length() != fLastRegionEnd) {
			// Apply the 'old' style
			applyStyleRegion(fTextStyle, currFont(), old_color);
		}
	}
	
	private void clrColor() {
		Color old_color = currColor();
		
		if (fColorStack.size() > 0) {
			fColorStack.pop();
		}
		
		if (old_color != currColor() && fSB.length() != fLastRegionEnd) {
			// Apply the old style
			applyStyleRegion(fTextStyle, currFont(), old_color);
		}
	}

	private Color currColor() {
		if (fColorStack.size() > 0) {
			return fColorStack.peek();
		} else {
			return null;
		}
	}

}
