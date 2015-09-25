/****************************************************************************
 * Copyright 2015 Mentor Graphics Corporation
 * All Rights Reserved Worldwide
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See
 * the License for the specific language governing
 * permissions and limitations under the License.
 ****************************************************************************/
package net.sf.psstools.lang.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.folding.IFoldingStructureProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

import net.sf.psstools.lang.ui.editor.PSSFoldingStructureProvider;
import net.sf.psstools.lang.ui.editor.PSSOutlinePage;

/**
 * Use this class to register components to be used within the IDE.
 */
public class PSSUiModule extends net.sf.psstools.lang.ui.AbstractPSSUiModule {
	public PSSUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IFoldingStructureProvider> bindIFoldingStructureProvider() {
		return PSSFoldingStructureProvider.class;
	}
	
	public Class<? extends OutlinePage> bindOutlinePage() {
		System.out.println("bindOutlinePage");
		return PSSOutlinePage.class;
	}

}
