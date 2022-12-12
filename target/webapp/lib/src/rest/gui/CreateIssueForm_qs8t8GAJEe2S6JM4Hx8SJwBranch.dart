// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIOutputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';

class CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch extends ContinueProcessRequest {
	
	
	Submit branch_Submit;
	
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.forSubmitBranch(
{		String title:''
}	) {
		branch_Submit = new Submit();
		branch_Submit.port_title = title;
	}
	Back branch_Back;
	
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.forBackBranch(
	) {
		branch_Back = new Back();
	}

	String toJSON() {
		return jsonEncode(toJSOG());
	}
		
	Map<String,dynamic> toJSOG()
	{
		Map<String,dynamic> jsonObj = new Map();
		
		if(branch_Submit!=null) {
			return branch_Submit.toJSOG();
		}
		if(branch_Back!=null) {
			return branch_Back.toJSOG();
		}
		throw new Exception("Exhaustive IF CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.dart");
	}
}
	
	class Submit {
		
		String port_title = '';

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			jsonObj["title"] = this.port_title;
					
			return jsonObj;
		}
		
	}
	class Back {
		

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
					
			return jsonObj;
		}
		
	}
