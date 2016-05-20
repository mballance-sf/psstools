#******************************************************************************
#* Primary Makefile
#******************************************************************************

include rules_defs.mk
include $(PSSTOOLS_DIR)/pss2xml/rules_defs.mk
include $(PSSTOOLS_DIR)/psi/src/rules_defs.mk

all : $(LIB_TARGETS) $(EXE_TARGETS) $(INST_TARGETS)
	$(Q)echo "SCRIPTS_DIR=$(SCRIPTS_DIR)"
	$(Q)echo "PSSTOOLS_DIR=$(PSSTOOLS_DIR)"


# build : $(LIB_TARGETS) $(EXE_TARGETS) $(INST_TARGETS)

RULES:=1

clean :
	$(Q)rm -rf $(BUILDDIR)

include rules_defs.mk	
include $(PSSTOOLS_DIR)/pss2xml/rules_defs.mk
include $(PSSTOOLS_DIR)/psi/src/rules_defs.mk

