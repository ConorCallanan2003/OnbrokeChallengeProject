
		// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumeInput
		
		package info.scce.dime.rest.gui.model;
		
		public class _PdUCgVuYEe2C__HYPHEN_MINUS__dvY0XUmpABranch{
			

			info.scce.dime.process.ProcessCallFrame callStack;
			
			@com.fasterxml.jackson.annotation.JsonProperty("dywaData")
			@com.codingrodent.jackson.crypto.Encrypt
			@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = info.scce.dime.rest.ContextIndependentSerializer.class)
			@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = info.scce.dime.rest.ContextIndependentDeserializer.class)
			public info.scce.dime.process.ProcessCallFrame getCallStack() {
				return callStack;
			}
			

			@com.fasterxml.jackson.annotation.JsonProperty("dywaData")
			public void setCallStack(info.scce.dime.process.ProcessCallFrame callStack) {
				this.callStack = callStack;
			}
			private de.ls5.dywa.generated.rest.types.Bidding
			 bidding;
			
			@com.fasterxml.jackson.annotation.JsonProperty("bidding")
			public de.ls5.dywa.generated.rest.types.Bidding
			 getBidding() {
				return bidding;
			}
			
			@com.fasterxml.jackson.annotation.JsonProperty("bidding")
			public void setBidding(de.ls5.dywa.generated.rest.types.Bidding
			 bidding) {
				this.bidding = bidding;
			}
		}
