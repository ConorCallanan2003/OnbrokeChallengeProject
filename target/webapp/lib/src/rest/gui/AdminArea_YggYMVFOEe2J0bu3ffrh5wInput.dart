// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIInputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';

class AdminArea_YggYMVFOEe2J0bu3ffrh5wInput extends UserInteractionResponse {
	
	DIMEList<Data.Bidding> biddings = new DIMEList<Data.Bidding>();
	DIMEList<Data.Offer> offers = new DIMEList<Data.Offer>();
	DIMEList<Data.Feature> featuresForBidding = new DIMEList<Data.Feature>();
	DIMEList<Data.User> users = new DIMEList<Data.User>();
	DIMEList<Data.Feature> featuresForOffer = new DIMEList<Data.Feature>();
	
	AdminArea_YggYMVFOEe2J0bu3ffrh5wInput(Map<String,dynamic> map, Map<String,dynamic> cache)
	{
		 Map<String,dynamic> inputPorts = map['inputs'];
		if(inputPorts.containsKey('biddings')) {
			for(var entry in inputPorts['biddings']) {
				biddings.add(
					Data.Bidding.fromJSOG(jsog:entry,cache:cache)
				);
			}
		}
		if(inputPorts.containsKey('featuresForBidding')) {
			for(var entry in inputPorts['featuresForBidding']) {
				featuresForBidding.add(
					Data.Feature.fromJSOG(jsog:entry,cache:cache)
				);
			}
		}
		if(inputPorts.containsKey('featuresForOffer')) {
			for(var entry in inputPorts['featuresForOffer']) {
				featuresForOffer.add(
					Data.Feature.fromJSOG(jsog:entry,cache:cache)
				);
			}
		}
		if(inputPorts.containsKey('offers')) {
			for(var entry in inputPorts['offers']) {
				offers.add(
					Data.Offer.fromJSOG(jsog:entry,cache:cache)
				);
			}
		}
		if(inputPorts.containsKey('users')) {
			for(var entry in inputPorts['users']) {
				users.add(
					Data.User.fromJSOG(jsog:entry,cache:cache)
				);
			}
		}
	}
	
	@override
	bool startedByEvent() {
	    return false;
	}
	
	bool inpusChanged(AdminArea_YggYMVFOEe2J0bu3ffrh5wInput input) {
		return biddings != input.biddings || offers != input.offers || featuresForBidding != input.featuresForBidding || users != input.users || featuresForOffer != input.featuresForOffer;
	}
}
