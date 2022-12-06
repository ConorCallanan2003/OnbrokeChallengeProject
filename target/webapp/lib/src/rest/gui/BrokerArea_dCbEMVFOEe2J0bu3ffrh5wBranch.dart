// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIOutputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';

class BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch extends ContinueProcessRequest {
	
	
	Show_offer branch_Show_offer;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forShow_offerBranch(
{		Data.Offer offer:null
}	) {
		branch_Show_offer = new Show_offer();
		branch_Show_offer.port_offer = offer;
	}
	Decide_offer branch_Decide_offer;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forDecide_offerBranch(
{		Data.Offer offer:null
}	) {
		branch_Decide_offer = new Decide_offer();
		branch_Decide_offer.port_offer = offer;
	}
	Review_offer branch_Review_offer;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forReview_offerBranch(
{		Data.Offer offer:null
}	) {
		branch_Review_offer = new Review_offer();
		branch_Review_offer.port_offer = offer;
	}
	Edit_report branch_Edit_report;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forEdit_reportBranch(
{		Data.Report report:null
}	) {
		branch_Edit_report = new Edit_report();
		branch_Edit_report.port_report = report;
	}
	Revoke_offer branch_Revoke_offer;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forRevoke_offerBranch(
{		Data.Offer offer:null
}	) {
		branch_Revoke_offer = new Revoke_offer();
		branch_Revoke_offer.port_offer = offer;
	}
	Show_bidding branch_Show_bidding;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forShow_biddingBranch(
{		Data.Bidding bidding:null
}	) {
		branch_Show_bidding = new Show_bidding();
		branch_Show_bidding.port_bidding = bidding;
	}
	Decide_bidding branch_Decide_bidding;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forDecide_biddingBranch(
{		Data.Bidding bidding:null
}	) {
		branch_Decide_bidding = new Decide_bidding();
		branch_Decide_bidding.port_bidding = bidding;
	}
	Review_bidding branch_Review_bidding;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forReview_biddingBranch(
{		Data.Bidding bidding:null
}	) {
		branch_Review_bidding = new Review_bidding();
		branch_Review_bidding.port_bidding = bidding;
	}
	Revoke_bidding branch_Revoke_bidding;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forRevoke_biddingBranch(
{		Data.Bidding bidding:null
}	) {
		branch_Revoke_bidding = new Revoke_bidding();
		branch_Revoke_bidding.port_bidding = bidding;
	}
	Assign branch_Assign;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forAssignBranch(
{		Data.Bidding bidding:null
}	) {
		branch_Assign = new Assign();
		branch_Assign.port_bidding = bidding;
	}
	Unassign branch_Unassign;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forUnassignBranch(
{		Data.Bidding bidding:null
}	) {
		branch_Unassign = new Unassign();
		branch_Unassign.port_bidding = bidding;
	}
	Edit branch_Edit;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forEditBranch(
{		Data.Bidding bidding:null
}	) {
		branch_Edit = new Edit();
		branch_Edit.port_bidding = bidding;
	}
	Auto_Assign branch_Auto_Assign;
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forAuto_AssignBranch(
{		DIMEList<Data.Offer> approvedOffers:null
}	) {
		branch_Auto_Assign = new Auto_Assign();
		approvedOffers = approvedOffers==null?new DIMEList():approvedOffers;
		branch_Auto_Assign.port_approvedOffers = approvedOffers;
	}

	String toJSON() {
		return jsonEncode(toJSOG());
	}
		
	Map<String,dynamic> toJSOG()
	{
		Map<String,dynamic> jsonObj = new Map();
		
		if(branch_Show_offer!=null) {
			return branch_Show_offer.toJSOG();
		}
		if(branch_Decide_offer!=null) {
			return branch_Decide_offer.toJSOG();
		}
		if(branch_Review_offer!=null) {
			return branch_Review_offer.toJSOG();
		}
		if(branch_Edit_report!=null) {
			return branch_Edit_report.toJSOG();
		}
		if(branch_Revoke_offer!=null) {
			return branch_Revoke_offer.toJSOG();
		}
		if(branch_Show_bidding!=null) {
			return branch_Show_bidding.toJSOG();
		}
		if(branch_Decide_bidding!=null) {
			return branch_Decide_bidding.toJSOG();
		}
		if(branch_Review_bidding!=null) {
			return branch_Review_bidding.toJSOG();
		}
		if(branch_Revoke_bidding!=null) {
			return branch_Revoke_bidding.toJSOG();
		}
		if(branch_Assign!=null) {
			return branch_Assign.toJSOG();
		}
		if(branch_Unassign!=null) {
			return branch_Unassign.toJSOG();
		}
		if(branch_Edit!=null) {
			return branch_Edit.toJSOG();
		}
		if(branch_Auto_Assign!=null) {
			return branch_Auto_Assign.toJSOG();
		}
		throw new Exception("Exhaustive IF BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.dart");
	}
}
	
	class Show_offer {
		
		Data.Offer port_offer = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_offer != null){
				jsonObj["offer"] = this.port_offer.toJSOG(cache);
			}
			else{
				jsonObj["offer"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Decide_offer {
		
		Data.Offer port_offer = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_offer != null){
				jsonObj["offer"] = this.port_offer.toJSOG(cache);
			}
			else{
				jsonObj["offer"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Review_offer {
		
		Data.Offer port_offer = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_offer != null){
				jsonObj["offer"] = this.port_offer.toJSOG(cache);
			}
			else{
				jsonObj["offer"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Edit_report {
		
		Data.Report port_report = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_report != null){
				jsonObj["report"] = this.port_report.toJSOG(cache);
			}
			else{
				jsonObj["report"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Revoke_offer {
		
		Data.Offer port_offer = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_offer != null){
				jsonObj["offer"] = this.port_offer.toJSOG(cache);
			}
			else{
				jsonObj["offer"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Show_bidding {
		
		Data.Bidding port_bidding = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_bidding != null){
				jsonObj["bidding"] = this.port_bidding.toJSOG(cache);
			}
			else{
				jsonObj["bidding"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Decide_bidding {
		
		Data.Bidding port_bidding = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_bidding != null){
				jsonObj["bidding"] = this.port_bidding.toJSOG(cache);
			}
			else{
				jsonObj["bidding"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Review_bidding {
		
		Data.Bidding port_bidding = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_bidding != null){
				jsonObj["bidding"] = this.port_bidding.toJSOG(cache);
			}
			else{
				jsonObj["bidding"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Revoke_bidding {
		
		Data.Bidding port_bidding = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_bidding != null){
				jsonObj["bidding"] = this.port_bidding.toJSOG(cache);
			}
			else{
				jsonObj["bidding"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Assign {
		
		Data.Bidding port_bidding = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_bidding != null){
				jsonObj["bidding"] = this.port_bidding.toJSOG(cache);
			}
			else{
				jsonObj["bidding"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Unassign {
		
		Data.Bidding port_bidding = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_bidding != null){
				jsonObj["bidding"] = this.port_bidding.toJSOG(cache);
			}
			else{
				jsonObj["bidding"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Edit {
		
		Data.Bidding port_bidding = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_bidding != null){
				jsonObj["bidding"] = this.port_bidding.toJSOG(cache);
			}
			else{
				jsonObj["bidding"] = null;
			}
					
			return jsonObj;
		}
		
	}
	class Auto_Assign {
		
		DIMEList<Data.Offer> port_approvedOffers = new DIMEList();

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_approvedOffers.isEmpty){
				jsonObj["approvedOffers"] = [];
			}
			else{
				jsonObj["approvedOffers"] = 
				this.port_approvedOffers.map((n)=>n.toJSOG(cache)).toList();
			}
					
			return jsonObj;
		}
		
	}
