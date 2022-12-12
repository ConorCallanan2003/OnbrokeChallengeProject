// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIOutputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';

class EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gBranch extends ContinueProcessRequest {
	
	
	Submit branch_Submit;
	
	EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gBranch.forSubmitBranch(
{		String title:'',
		Data.Priority priority:null
}	) {
		branch_Submit = new Submit();
		branch_Submit.port_title = title;
		branch_Submit.port_priority = priority;
	}
	Cancel branch_Cancel;
	
	EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gBranch.forCancelBranch(
	) {
		branch_Cancel = new Cancel();
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
		if(branch_Cancel!=null) {
			return branch_Cancel.toJSOG();
		}
		throw new Exception("Exhaustive IF EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gBranch.dart");
	}
}
	
	class Submit {
		
		String port_title = '';
		Data.Priority port_priority = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			jsonObj["title"] = this.port_title;
			if(this.port_priority != null){
				jsonObj["priority"] = this.port_priority.toJSOG(cache);
			}
			else{
				jsonObj["priority"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Cancel {
		

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
					
			return jsonObj;
		}
		
	}
