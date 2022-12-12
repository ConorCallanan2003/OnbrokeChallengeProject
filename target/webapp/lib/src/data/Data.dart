import 'dart:core' as core;
import 'dart:convert';
import '../models/FileReference.dart';
import '../models/Selectives.dart';
import '../commons/Exceptions.dart';

class DataCastUtil {
	
	const DataCastUtil();
	static User castToUser(core.Object o) => o as User;
	static DIMEList<User> castToListUser(DIMEList<core.Object> os) => new DIMEList.from(os.cast<User>());
	static DIMEList<User> newListUser() => new DIMEList<User>();
	
	static BaseUser castToBaseUser(core.Object o) => o as BaseUser;
	static DIMEList<BaseUser> castToListBaseUser(DIMEList<core.Object> os) => new DIMEList.from(os.cast<BaseUser>());
	static DIMEList<BaseUser> newListBaseUser() => new DIMEList<BaseUser>();
	
	static UserRole castToUserRole(core.Object o) => o as UserRole;
	static DIMEList<UserRole> castToListUserRole(DIMEList<core.Object> os) => new DIMEList.from(os.cast<UserRole>());
	static DIMEList<UserRole> newListUserRole() => new DIMEList<UserRole>();
	
	static Offer castToOffer(core.Object o) => o as Offer;
	static DIMEList<Offer> castToListOffer(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Offer>());
	static DIMEList<Offer> newListOffer() => new DIMEList<Offer>();
	
	static Bidding castToBidding(core.Object o) => o as Bidding;
	static DIMEList<Bidding> castToListBidding(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Bidding>());
	static DIMEList<Bidding> newListBidding() => new DIMEList<Bidding>();
	
	static Report castToReport(core.Object o) => o as Report;
	static DIMEList<Report> castToListReport(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Report>());
	static DIMEList<Report> newListReport() => new DIMEList<Report>();
	
	static DecisionState castToDecisionState(core.Object o) => o as DecisionState;
	static DIMEList<DecisionState> castToListDecisionState(DIMEList<core.Object> os) => new DIMEList.from(os.cast<DecisionState>());
	static DIMEList<DecisionState> newListDecisionState() => new DIMEList<DecisionState>();
	
	static Decision castToDecision(core.Object o) => o as Decision;
	static DIMEList<Decision> castToListDecision(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Decision>());
	static DIMEList<Decision> newListDecision() => new DIMEList<Decision>();
	
	static Submission castToSubmission(core.Object o) => o as Submission;
	static DIMEList<Submission> castToListSubmission(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Submission>());
	static DIMEList<Submission> newListSubmission() => new DIMEList<Submission>();
	
	static Feature castToFeature(core.Object o) => o as Feature;
	static DIMEList<Feature> castToListFeature(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Feature>());
	static DIMEList<Feature> newListFeature() => new DIMEList<Feature>();
	
	static Priority castToPriority(core.Object o) => o as Priority;
	static DIMEList<Priority> castToListPriority(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Priority>());
	static DIMEList<Priority> newListPriority() => new DIMEList<Priority>();
	
	static Issue castToIssue(core.Object o) => o as Issue;
	static DIMEList<Issue> castToListIssue(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Issue>());
	static DIMEList<Issue> newListIssue() => new DIMEList<Issue>();
	
	static Comment castToComment(core.Object o) => o as Comment;
	static DIMEList<Comment> castToListComment(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Comment>());
	static DIMEList<Comment> newListComment() => new DIMEList<Comment>();
	
	static IssueState castToIssueState(core.Object o) => o as IssueState;
	static DIMEList<IssueState> castToListIssueState(DIMEList<core.Object> os) => new DIMEList.from(os.cast<IssueState>());
	static DIMEList<IssueState> newListIssueState() => new DIMEList<IssueState>();
	
	static Assignment castToAssignment(core.Object o) => o as Assignment;
	static DIMEList<Assignment> castToListAssignment(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Assignment>());
	static DIMEList<Assignment> newListAssignment() => new DIMEList<Assignment>();
	
	static Status castToStatus(core.Object o) => o as Status;
	static DIMEList<Status> castToListStatus(DIMEList<core.Object> os) => new DIMEList.from(os.cast<Status>());
	static DIMEList<Status> newListStatus() => new DIMEList<Status>();
}
class User extends BaseModel
{
	core.bool _baseUserHasBeenSet = false;
	core.bool baseUserHasBeenChanged() => _baseUserHasBeenSet||(_baseUser==null?false:_baseUser.hasChanged()) ;
	BaseUser _baseUser;
	core.bool _biddingsHasBeenSet = false;
	core.bool biddingsHasBeenChanged() => _biddingsHasBeenSet;
	DIMEList<Bidding> _biddings;
	core.bool _commentHasBeenSet = false;
	core.bool commentHasBeenChanged() => _commentHasBeenSet||(_comment==null?false:_comment.hasChanged()) ;
	Comment _comment;
	core.bool _dywaSwitchedToHasBeenSet = false;
	core.bool dywaSwitchedToHasBeenChanged() => _dywaSwitchedToHasBeenSet||(_dywaSwitchedTo==null?false:_dywaSwitchedTo.hasChanged()) ;
	User _dywaSwitchedTo;
	core.bool _firstNameHasBeenSet = false;
	core.bool firstNameHasBeenChanged() => _firstNameHasBeenSet;
	core.String _firstName;
	core.bool _lastNameHasBeenSet = false;
	core.bool lastNameHasBeenChanged() => _lastNameHasBeenSet;
	core.String _lastName;
	core.bool _offersHasBeenSet = false;
	core.bool offersHasBeenChanged() => _offersHasBeenSet;
	DIMEList<Offer> _offers;
	core.bool _roleHasBeenSet = false;
	core.bool roleHasBeenChanged() => _roleHasBeenSet||(_role==null?false:_role.hasChanged()) ;
	UserRole _role;
	
	static User fromId(core.int id) {
		var m = new User();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'baseUser': this.baseUser, 
	  'biddings': this.biddings, 
	  'comment': this.comment, 
	  'dywaSwitchedTo': this.dywaSwitchedTo, 
	  'firstName': this.firstName, 
	  'lastName': this.lastName, 
	  'offers': this.offers, 
	  'role': this.role
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'baseUser': this.baseUser = value; return;
	  case 'biddings': this.biddings = value; return;
	  case 'comment': this.comment = value; return;
	  case 'dywaSwitchedTo': this.dywaSwitchedTo = value; return;
	  case 'firstName': this.firstName = value; return;
	  case 'lastName': this.lastName = value; return;
	  case 'offers': this.offers = value; return;
	  case 'role': this.role = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	User({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._biddings = new DIMEList.monitored(biddingsHasBeenSetted);
			this._firstName = null;
			this._lastName = null;
			this._offers = new DIMEList.monitored(offersHasBeenSetted);
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("baseUser")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["baseUser"];
				if(jsogObj != null) {
					BaseUser valueafPY24MwNEeWZVvvwxpYu8A;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueafPY24MwNEeWZVvvwxpYu8A = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.BaseUser") {
								valueafPY24MwNEeWZVvvwxpYu8A = new BaseUser(cache: cache, jsog: jsogObj);
							}
							else {
								valueafPY24MwNEeWZVvvwxpYu8A = new BaseUser(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueafPY24MwNEeWZVvvwxpYu8A = new BaseUser(cache: cache,jsog: jsogObj);
						}
					}
					this._baseUser = valueafPY24MwNEeWZVvvwxpYu8A;
				}
			}
			
			
			_baseUserHasBeenSet = false;
			this._biddings = new DIMEList.monitored(biddingsHasBeenSetted);
			if (jsog.containsKey("biddings")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["biddings"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Bidding valueaT0OEsVFNEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaT0OEsVFNEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.BiddingImpl") {
								valueaT0OEsVFNEe2J0bu3ffrh5w = new Bidding(cache: cache, jsog: jsogObj);
							}
							else {
								valueaT0OEsVFNEe2J0bu3ffrh5w = new Bidding(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaT0OEsVFNEe2J0bu3ffrh5w = new Bidding(cache: cache,jsog: jsogObj);
						}
					}
					this._biddings.add(valueaT0OEsVFNEe2J0bu3ffrh5w);
				}
			}
			
			
			_biddingsHasBeenSet = false;
			if (jsog.containsKey("comment")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["comment"];
				if(jsogObj != null) {
					Comment valueaVhJc4XmXEe2yL_RKKzoxiA;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaVhJc4XmXEe2yL_RKKzoxiA = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.CommentImpl") {
								valueaVhJc4XmXEe2yL_RKKzoxiA = new Comment(cache: cache, jsog: jsogObj);
							}
							else {
								valueaVhJc4XmXEe2yL_RKKzoxiA = new Comment(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaVhJc4XmXEe2yL_RKKzoxiA = new Comment(cache: cache,jsog: jsogObj);
						}
					}
					this._comment = valueaVhJc4XmXEe2yL_RKKzoxiA;
				}
			}
			
			
			_commentHasBeenSet = false;
			if (jsog.containsKey("dywaSwitchedTo")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["dywaSwitchedTo"];
				if(jsogObj != null) {
					User valueaMssRwXmkEe2ix_xiis0jnw;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaMssRwXmkEe2ix_xiis0jnw = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.UserImpl") {
								valueaMssRwXmkEe2ix_xiis0jnw = new User(cache: cache, jsog: jsogObj);
							}
							else {
								valueaMssRwXmkEe2ix_xiis0jnw = new User(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaMssRwXmkEe2ix_xiis0jnw = new User(cache: cache,jsog: jsogObj);
						}
					}
					this._dywaSwitchedTo = valueaMssRwXmkEe2ix_xiis0jnw;
				}
			}
			
			
			_dywaSwitchedToHasBeenSet = false;
			if (jsog.containsKey("firstName")) {
				core.String jsogObj = jsog["firstName"];
				if(jsogObj != null) {
					core.String valueaKAc_45_cUIAEe26p7mBymqW2w;
					
					if(jsogObj!=null){
					valueaKAc_45_cUIAEe26p7mBymqW2w = jsogObj.toString();
					}
					this._firstName = valueaKAc_45_cUIAEe26p7mBymqW2w;
				}
				else {
					this._firstName = null;
				}
			}
			
			
			else{
				this._firstName = null;
			}
			_firstNameHasBeenSet = false;
			if (jsog.containsKey("lastName")) {
				core.String jsogObj = jsog["lastName"];
				if(jsogObj != null) {
					core.String valueaLjih0UIAEe26p7mBymqW2w;
					
					if(jsogObj!=null){
					valueaLjih0UIAEe26p7mBymqW2w = jsogObj.toString();
					}
					this._lastName = valueaLjih0UIAEe26p7mBymqW2w;
				}
				else {
					this._lastName = null;
				}
			}
			
			
			else{
				this._lastName = null;
			}
			_lastNameHasBeenSet = false;
			this._offers = new DIMEList.monitored(offersHasBeenSetted);
			if (jsog.containsKey("offers")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["offers"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Offer valueaSTDz8VFNEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaSTDz8VFNEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.OfferImpl") {
								valueaSTDz8VFNEe2J0bu3ffrh5w = new Offer(cache: cache, jsog: jsogObj);
							}
							else {
								valueaSTDz8VFNEe2J0bu3ffrh5w = new Offer(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaSTDz8VFNEe2J0bu3ffrh5w = new Offer(cache: cache,jsog: jsogObj);
						}
					}
					this._offers.add(valueaSTDz8VFNEe2J0bu3ffrh5w);
				}
			}
			
			
			_offersHasBeenSet = false;
			if (jsog.containsKey("role")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["role"];
				if(jsogObj != null) {
					UserRole valueavk0f0FE3Ee2Vgcav4Znc_w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueavk0f0FE3Ee2Vgcav4Znc_w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.UserRole") {
								valueavk0f0FE3Ee2Vgcav4Znc_w = new UserRole(cache: cache, jsog: jsogObj);
							}
							else {
								valueavk0f0FE3Ee2Vgcav4Znc_w = new UserRole(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueavk0f0FE3Ee2Vgcav4Znc_w = new UserRole(cache: cache,jsog: jsogObj);
						}
					}
					this._role = valueavk0f0FE3Ee2Vgcav4Znc_w;
				}
			}
			
			
			_roleHasBeenSet = false;
		}
	}
	
	void baseUserHasBeenSetted() { _baseUserHasBeenSet=true; }
	void biddingsHasBeenSetted() { _biddingsHasBeenSet=true; }
	void commentHasBeenSetted() { _commentHasBeenSet=true; }
	void dywaSwitchedToHasBeenSetted() { _dywaSwitchedToHasBeenSet=true; }
	void firstNameHasBeenSetted() { _firstNameHasBeenSet=true; }
	void lastNameHasBeenSetted() { _lastNameHasBeenSet=true; }
	void offersHasBeenSetted() { _offersHasBeenSet=true; }
	void roleHasBeenSetted() { _roleHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_baseUserHasBeenSet || 
					_biddingsHasBeenSet || 
					_commentHasBeenSet || 
					_dywaSwitchedToHasBeenSet || 
					_firstNameHasBeenSet || 
					_lastNameHasBeenSet || 
					_offersHasBeenSet || 
					_roleHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( baseUserHasBeenChanged() && !jsonObj.containsKey('baseUser')) && !objects.containsKey(this._baseUser)) {
			if(this._baseUser != null) {
				jsonObj["baseUser"] = this._baseUser.toJSOG(objects);
			}
			else {
				jsonObj["baseUser"] = null;
			}
			}
			if(( roleHasBeenChanged() && !jsonObj.containsKey('role')) && !objects.containsKey(this._role)) {
			if(this._role != null) {
				jsonObj["role"] = this._role.toJSOG(objects);
			}
			else {
				jsonObj["role"] = null;
			}
			}
			if(( offersHasBeenChanged() && !jsonObj.containsKey('offers'))) {
			if(this._offers.isEmpty){
				jsonObj["offers"] = [];
			}
			else{
				jsonObj["offers"] = this._offers.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( biddingsHasBeenChanged() && !jsonObj.containsKey('biddings'))) {
			if(this._biddings.isEmpty){
				jsonObj["biddings"] = [];
			}
			else{
				jsonObj["biddings"] = this._biddings.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( commentHasBeenChanged() && !jsonObj.containsKey('comment')) && !objects.containsKey(this._comment)) {
			if(this._comment != null) {
				jsonObj["comment"] = this._comment.toJSOG(objects);
			}
			else {
				jsonObj["comment"] = null;
			}
			}
			if(( dywaSwitchedToHasBeenChanged() && !jsonObj.containsKey('dywaSwitchedTo')) && !objects.containsKey(this._dywaSwitchedTo)) {
			if(this._dywaSwitchedTo != null) {
				if (this._dywaSwitchedTo == this) {
					jsonObj["dywaSwitchedTo"] = { '@ref': jsogId.toString() };
				} else {
					jsonObj["dywaSwitchedTo"] = this._dywaSwitchedTo.toJSOG(objects);
				}
			}
			else {
				jsonObj["dywaSwitchedTo"] = null;
			}
			}
			if(( firstNameHasBeenChanged() && !jsonObj.containsKey('firstName')) && !objects.containsKey(this._firstName)) {
			jsonObj["firstName"] = this._firstName;
			}
			if(( lastNameHasBeenChanged() && !jsonObj.containsKey('lastName')) && !objects.containsKey(this._lastName)) {
			jsonObj["lastName"] = this._lastName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.UserImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( baseUserHasBeenChanged() && !jsonObj.containsKey('baseUser')) && !objects.containsKey(this._baseUser) || this.dywa_id == 0) {
		if(this._baseUser != null) {
			jsonObj["baseUser"] = this._baseUser.toJSOG(objects);
		}
		else {
			jsonObj["baseUser"] = null;
		}
		}
		if(( roleHasBeenChanged() && !jsonObj.containsKey('role')) && !objects.containsKey(this._role) || this.dywa_id == 0) {
		if(this._role != null) {
			jsonObj["role"] = this._role.toJSOG(objects);
		}
		else {
			jsonObj["role"] = null;
		}
		}
		if(( offersHasBeenChanged() && !jsonObj.containsKey('offers')) || this.dywa_id == 0) {
		if(this._offers.isEmpty){
			jsonObj["offers"] = [];
		}
		else{
			jsonObj["offers"] = this._offers.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( biddingsHasBeenChanged() && !jsonObj.containsKey('biddings')) || this.dywa_id == 0) {
		if(this._biddings.isEmpty){
			jsonObj["biddings"] = [];
		}
		else{
			jsonObj["biddings"] = this._biddings.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( commentHasBeenChanged() && !jsonObj.containsKey('comment')) && !objects.containsKey(this._comment) || this.dywa_id == 0) {
		if(this._comment != null) {
			jsonObj["comment"] = this._comment.toJSOG(objects);
		}
		else {
			jsonObj["comment"] = null;
		}
		}
		if(( dywaSwitchedToHasBeenChanged() && !jsonObj.containsKey('dywaSwitchedTo')) && !objects.containsKey(this._dywaSwitchedTo) || this.dywa_id == 0) {
		if(this._dywaSwitchedTo != null) {
			if (this._dywaSwitchedTo == this) {
				jsonObj["dywaSwitchedTo"] = { '@ref': jsogId.toString() };
			} else {
				jsonObj["dywaSwitchedTo"] = this._dywaSwitchedTo.toJSOG(objects);
			}
		}
		else {
			jsonObj["dywaSwitchedTo"] = null;
		}
		}
		if(( firstNameHasBeenChanged() && !jsonObj.containsKey('firstName')) && !objects.containsKey(this._firstName) || this.dywa_id == 0) {
		jsonObj["firstName"] = this._firstName;
		}
		if(( lastNameHasBeenChanged() && !jsonObj.containsKey('lastName')) && !objects.containsKey(this._lastName) || this.dywa_id == 0) {
		jsonObj["lastName"] = this._lastName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static User fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.UserImpl') {
			return new User(cache:cache,jsog:jsog);
		}
		return new User(cache:cache,jsog:jsog);
	}
	
	void set baseUser (BaseUser value)
	{
		this._baseUserHasBeenSet = true;
		this._baseUser = value;
	}
	
	BaseUser get baseUser
	{
		return this._baseUser;
	}
	
		BaseUser initOnDemandbaseUser()
		{
			if(this._baseUser == null) {
			this.baseUser = new BaseUser();
			}
			return this.baseUser;
		}
		
		void setValuebaseUser(BaseUser value)
		{
			this.baseUser = value;
		}
		
		void baseUsersetValue(BaseUser value)
		{
			this.baseUser = value;
		}
		
	
	void set role (UserRole value)
	{
		this._roleHasBeenSet = true;
		this._role = value;
	}
	
	UserRole get role
	{
		return this._role;
	}
	
		UserRole initOnDemandrole()
		{
			if(this._role == null) {
			this.role = new UserRole();
			}
			return this.role;
		}
		
		void setValuerole(UserRole value)
		{
			this.role = value;
		}
		
		void rolesetValue(UserRole value)
		{
			this.role = value;
		}
		
	
	void set offers (DIMEList<Offer> value)
	{
		this._offersHasBeenSet = true;
		this._offers = value;
	}
	
	DIMEList<Offer> get offers
	{
		return this._offers;
	}
	
		DIMEList<Offer> initOnDemandoffers()
		{
			if(this._offers == null) {
			this._offers = new DIMEList();
			}
			return this.offers;
		}
		
		void setValueoffers(DIMEList<Offer> value)
		{
			this.offers = value;
		}
		
		void offerssetValue(DIMEList<Offer> value)
		{
			this.offers = value;
		}
		
		void offersadd(Offer value)
		{
			this.offers.add(value);
			this._offersHasBeenSet = true;
		}

	
	void set biddings (DIMEList<Bidding> value)
	{
		this._biddingsHasBeenSet = true;
		this._biddings = value;
	}
	
	DIMEList<Bidding> get biddings
	{
		return this._biddings;
	}
	
		DIMEList<Bidding> initOnDemandbiddings()
		{
			if(this._biddings == null) {
			this._biddings = new DIMEList();
			}
			return this.biddings;
		}
		
		void setValuebiddings(DIMEList<Bidding> value)
		{
			this.biddings = value;
		}
		
		void biddingssetValue(DIMEList<Bidding> value)
		{
			this.biddings = value;
		}
		
		void biddingsadd(Bidding value)
		{
			this.biddings.add(value);
			this._biddingsHasBeenSet = true;
		}

	
	void set comment (Comment value)
	{
		this._commentHasBeenSet = true;
		this._comment = value;
	}
	
	Comment get comment
	{
		return this._comment;
	}
	
		Comment initOnDemandcomment()
		{
			if(this._comment == null) {
			this.comment = new Comment();
			}
			return this.comment;
		}
		
		void setValuecomment(Comment value)
		{
			this.comment = value;
		}
		
		void commentsetValue(Comment value)
		{
			this.comment = value;
		}
		
	
	void set dywaSwitchedTo (User value)
	{
		this._dywaSwitchedToHasBeenSet = true;
		this._dywaSwitchedTo = value;
	}
	
	User get dywaSwitchedTo
	{
		return this._dywaSwitchedTo;
	}
	
		User initOnDemanddywaSwitchedTo()
		{
			if(this._dywaSwitchedTo == null) {
			this.dywaSwitchedTo = new User();
			}
			return this.dywaSwitchedTo;
		}
		
		void setValuedywaSwitchedTo(User value)
		{
			this.dywaSwitchedTo = value;
		}
		
		void dywaSwitchedTosetValue(User value)
		{
			this.dywaSwitchedTo = value;
		}
		
	
	void set firstName (core.String value)
	{
		this._firstNameHasBeenSet = true;
		this._firstName = value;
	}
	
	core.String get firstName
	{
		return this._firstName;
	}
	
		core.String initOnDemandfirstName()
		{
			return this.firstName;
		}
		
		void setValuefirstName(core.String value)
		{
			this.firstName = value;
		}
		
		void firstNamesetValue(core.String value)
		{
			this.firstName = value;
		}
		
	
	void set lastName (core.String value)
	{
		this._lastNameHasBeenSet = true;
		this._lastName = value;
	}
	
	core.String get lastName
	{
		return this._lastName;
	}
	
		core.String initOnDemandlastName()
		{
			return this.lastName;
		}
		
		void setValuelastName(core.String value)
		{
			this.lastName = value;
		}
		
		void lastNamesetValue(core.String value)
		{
			this.lastName = value;
		}
		
	
}

class BaseUser extends BaseModel
{
	core.bool _passwordHasBeenSet = false;
	core.bool passwordHasBeenChanged() => _passwordHasBeenSet;
	core.String _password;
	core.bool _userHasBeenSet = false;
	core.bool userHasBeenChanged() => _userHasBeenSet;
	DIMEList<User> _user;
	core.bool _usernameHasBeenSet = false;
	core.bool usernameHasBeenChanged() => _usernameHasBeenSet;
	core.String _username;
	
	static BaseUser fromId(core.int id) {
		var m = new BaseUser();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'password': this.password, 
	  'user': this.user, 
	  'username': this.username
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'password': this.password = value; return;
	  case 'user': this.user = value; return;
	  case 'username': this.username = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	BaseUser({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._password = null;
			this._user = new DIMEList.monitored(userHasBeenSetted);
			this._username = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("password")) {
				core.String jsogObj = jsog["password"];
				if(jsogObj != null) {
					core.String valueaYIIgUMwNEeWZVvvwxpYu8A;
					
					if(jsogObj!=null){
					valueaYIIgUMwNEeWZVvvwxpYu8A = jsogObj.toString();
					}
					this._password = valueaYIIgUMwNEeWZVvvwxpYu8A;
				}
				else {
					this._password = null;
				}
			}
			
			
			else{
				this._password = null;
			}
			_passwordHasBeenSet = false;
			this._user = new DIMEList.monitored(userHasBeenSetted);
			if (jsog.containsKey("user")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["user"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					User valueafOkXgMwNEeWZVvvwxpYu8A;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueafOkXgMwNEeWZVvvwxpYu8A = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.UserImpl") {
								valueafOkXgMwNEeWZVvvwxpYu8A = new User(cache: cache, jsog: jsogObj);
							}
							else {
								valueafOkXgMwNEeWZVvvwxpYu8A = new User(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueafOkXgMwNEeWZVvvwxpYu8A = new User(cache: cache,jsog: jsogObj);
						}
					}
					this._user.add(valueafOkXgMwNEeWZVvvwxpYu8A);
				}
			}
			
			
			_userHasBeenSet = false;
			if (jsog.containsKey("username")) {
				core.String jsogObj = jsog["username"];
				if(jsogObj != null) {
					core.String valuea1aiCkG_QEeaqHezD6_45_M0AA;
					
					if(jsogObj!=null){
					valuea1aiCkG_QEeaqHezD6_45_M0AA = jsogObj.toString();
					}
					this._username = valuea1aiCkG_QEeaqHezD6_45_M0AA;
				}
				else {
					this._username = null;
				}
			}
			
			
			else{
				this._username = null;
			}
			_usernameHasBeenSet = false;
		}
	}
	
	void passwordHasBeenSetted() { _passwordHasBeenSet=true; }
	void userHasBeenSetted() { _userHasBeenSet=true; }
	void usernameHasBeenSetted() { _usernameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_passwordHasBeenSet || 
					_userHasBeenSet || 
					_usernameHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( userHasBeenChanged() && !jsonObj.containsKey('user'))) {
			if(this._user.isEmpty){
				jsonObj["user"] = [];
			}
			else{
				jsonObj["user"] = this._user.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( passwordHasBeenChanged() && !jsonObj.containsKey('password')) && !objects.containsKey(this._password)) {
			jsonObj["password"] = this._password;
			}
			if(( usernameHasBeenChanged() && !jsonObj.containsKey('username')) && !objects.containsKey(this._username)) {
			jsonObj["username"] = this._username;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.BaseUser";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( userHasBeenChanged() && !jsonObj.containsKey('user')) || this.dywa_id == 0) {
		if(this._user.isEmpty){
			jsonObj["user"] = [];
		}
		else{
			jsonObj["user"] = this._user.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( passwordHasBeenChanged() && !jsonObj.containsKey('password')) && !objects.containsKey(this._password) || this.dywa_id == 0) {
		jsonObj["password"] = this._password;
		}
		if(( usernameHasBeenChanged() && !jsonObj.containsKey('username')) && !objects.containsKey(this._username) || this.dywa_id == 0) {
		jsonObj["username"] = this._username;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static BaseUser fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.BaseUser') {
			return new BaseUser(cache:cache,jsog:jsog);
		}
		return new BaseUser(cache:cache,jsog:jsog);
	}
	
	void set user (DIMEList<User> value)
	{
		this._userHasBeenSet = true;
		this._user = value;
	}
	
	DIMEList<User> get user
	{
		return this._user;
	}
	
		DIMEList<User> initOnDemanduser()
		{
			if(this._user == null) {
			this._user = new DIMEList();
			}
			return this.user;
		}
		
		void setValueuser(DIMEList<User> value)
		{
			this.user = value;
		}
		
		void usersetValue(DIMEList<User> value)
		{
			this.user = value;
		}
		
		void useradd(User value)
		{
			this.user.add(value);
			this._userHasBeenSet = true;
		}

	
	void set password (core.String value)
	{
		this._passwordHasBeenSet = true;
		this._password = value;
	}
	
	core.String get password
	{
		return this._password;
	}
	
		core.String initOnDemandpassword()
		{
			return this.password;
		}
		
		void setValuepassword(core.String value)
		{
			this.password = value;
		}
		
		void passwordsetValue(core.String value)
		{
			this.password = value;
		}
		
	
	void set username (core.String value)
	{
		this._usernameHasBeenSet = true;
		this._username = value;
	}
	
	core.String get username
	{
		return this._username;
	}
	
		core.String initOnDemandusername()
		{
			return this.username;
		}
		
		void setValueusername(core.String value)
		{
			this.username = value;
		}
		
		void usernamesetValue(core.String value)
		{
			this.username = value;
		}
		
	
}

class UserRole extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static UserRole fromId(core.int id) {
		var m = new UserRole();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	UserRole({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaMs0NkXmkEe2ix_xiis0jnw;
					
					if(jsogObj!=null){
					valueaMs0NkXmkEe2ix_xiis0jnw = jsogObj.toString();
					}
					this._dywaDisplayName = valueaMs0NkXmkEe2ix_xiis0jnw;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'admin':
				return "admin";
			case 'broker':
				return "broker";
			case 'user':
				return "user";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.UserRole";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static UserRole fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.UserRole') {
			return new UserRole(cache:cache,jsog:jsog);
		}
		return new UserRole(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}

class Offer extends BaseModel implements Submission
{
	core.bool _assignedHasBeenSet = false;
	core.bool assignedHasBeenChanged() => _assignedHasBeenSet;
	core.bool _assigned;
	core.bool _biddingsHasBeenSet = false;
	core.bool biddingsHasBeenChanged() => _biddingsHasBeenSet;
	DIMEList<Bidding> _biddings;
	core.bool _decisionHasBeenSet = false;
	core.bool decisionHasBeenChanged() => _decisionHasBeenSet||(_decision==null?false:_decision.hasChanged()) ;
	Decision _decision;
	core.bool _descriptionHasBeenSet = false;
	core.bool descriptionHasBeenChanged() => _descriptionHasBeenSet;
	core.String _description;
	core.bool _featuresHasBeenSet = false;
	core.bool featuresHasBeenChanged() => _featuresHasBeenSet;
	DIMEList<Feature> _features;
	core.bool _issuesHasBeenSet = false;
	core.bool issuesHasBeenChanged() => _issuesHasBeenSet;
	DIMEList<Issue> _issues;
	core.bool _preferencesHasBeenSet = false;
	core.bool preferencesHasBeenChanged() => _preferencesHasBeenSet;
	DIMEList<Feature> _preferences;
	core.bool _reportHasBeenSet = false;
	core.bool reportHasBeenChanged() => _reportHasBeenSet||(_report==null?false:_report.hasChanged()) ;
	Report _report;
	core.bool _statusHasBeenSet = false;
	core.bool statusHasBeenChanged() => _statusHasBeenSet||(_status==null?false:_status.hasChanged()) ;
	Status _status;
	core.bool _titleHasBeenSet = false;
	core.bool titleHasBeenChanged() => _titleHasBeenSet;
	core.String _title;
	core.bool _userHasBeenSet = false;
	core.bool userHasBeenChanged() => _userHasBeenSet||(_user==null?false:_user.hasChanged()) ;
	User _user;
	core.bool _userCanDiscussHasBeenSet = false;
	core.bool userCanDiscussHasBeenChanged() => _userCanDiscussHasBeenSet;
	core.bool _userCanDiscuss;
	
	static Offer fromId(core.int id) {
		var m = new Offer();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'assigned': this.assigned, 
	  'biddings': this.biddings, 
	  'decision': this.decision, 
	  'description': this.description, 
	  'features': this.features, 
	  'issues': this.issues, 
	  'preferences': this.preferences, 
	  'report': this.report, 
	  'status': this.status, 
	  'title': this.title, 
	  'user': this.user, 
	  'userCanDiscuss': this.userCanDiscuss
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'assigned': this.assigned = value; return;
	  case 'biddings': this.biddings = value; return;
	  case 'decision': this.decision = value; return;
	  case 'description': this.description = value; return;
	  case 'features': this.features = value; return;
	  case 'issues': this.issues = value; return;
	  case 'preferences': this.preferences = value; return;
	  case 'report': this.report = value; return;
	  case 'status': this.status = value; return;
	  case 'title': this.title = value; return;
	  case 'user': this.user = value; return;
	  case 'userCanDiscuss': this.userCanDiscuss = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Offer({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._assigned = false;
			this._biddings = new DIMEList.monitored(biddingsHasBeenSetted);
			this._description = null;
			this._features = new DIMEList.monitored(featuresHasBeenSetted);
			this._issues = new DIMEList.monitored(issuesHasBeenSetted);
			this._preferences = new DIMEList.monitored(preferencesHasBeenSetted);
			this._title = null;
			this._userCanDiscuss = false;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("assigned")) {
				core.bool jsogObj = jsog["assigned"];
				if(jsogObj != null) {
					core.bool valuearTRUMVuBEe24_45_NGcS7DsBA;
					
					if(jsogObj!=null){
					valuearTRUMVuBEe24_45_NGcS7DsBA = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._assigned = valuearTRUMVuBEe24_45_NGcS7DsBA;
				}
				else {
					this._assigned = false;
				}
			}
			
			
			else{
				this._assigned = false;
			}
			_assignedHasBeenSet = false;
			this._biddings = new DIMEList.monitored(biddingsHasBeenSetted);
			if (jsog.containsKey("biddings")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["biddings"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Bidding valueaxZISQVGIEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaxZISQVGIEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.BiddingImpl") {
								valueaxZISQVGIEe2J0bu3ffrh5w = new Bidding(cache: cache, jsog: jsogObj);
							}
							else {
								valueaxZISQVGIEe2J0bu3ffrh5w = new Bidding(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaxZISQVGIEe2J0bu3ffrh5w = new Bidding(cache: cache,jsog: jsogObj);
						}
					}
					this._biddings.add(valueaxZISQVGIEe2J0bu3ffrh5w);
				}
			}
			
			
			_biddingsHasBeenSet = false;
			if (jsog.containsKey("decision")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["decision"];
				if(jsogObj != null) {
					Decision valueanrhWwVGDEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueanrhWwVGDEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.DecisionImpl") {
								valueanrhWwVGDEe2J0bu3ffrh5w = new Decision(cache: cache, jsog: jsogObj);
							}
							else {
								valueanrhWwVGDEe2J0bu3ffrh5w = new Decision(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueanrhWwVGDEe2J0bu3ffrh5w = new Decision(cache: cache,jsog: jsogObj);
						}
					}
					this._decision = valueanrhWwVGDEe2J0bu3ffrh5w;
				}
			}
			
			
			_decisionHasBeenSet = false;
			if (jsog.containsKey("description")) {
				core.String jsogObj = jsog["description"];
				if(jsogObj != null) {
					core.String valueasr08AXigEe2n6qlSkDlEsw;
					
					if(jsogObj!=null){
					valueasr08AXigEe2n6qlSkDlEsw = jsogObj.toString();
					}
					this._description = valueasr08AXigEe2n6qlSkDlEsw;
				}
				else {
					this._description = null;
				}
			}
			
			
			else{
				this._description = null;
			}
			_descriptionHasBeenSet = false;
			this._features = new DIMEList.monitored(featuresHasBeenSetted);
			if (jsog.containsKey("features")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["features"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Feature valueatxofoVMTEe2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueatxofoVMTEe2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.FeatureImpl") {
								valueatxofoVMTEe2KQc5QIsW97w = new Feature(cache: cache, jsog: jsogObj);
							}
							else {
								valueatxofoVMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueatxofoVMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
						}
					}
					this._features.add(valueatxofoVMTEe2KQc5QIsW97w);
				}
			}
			
			
			_featuresHasBeenSet = false;
			this._issues = new DIMEList.monitored(issuesHasBeenSetted);
			if (jsog.containsKey("issues")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["issues"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Issue valuea3M1ooVN9Ee2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valuea3M1ooVN9Ee2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.IssueImpl") {
								valuea3M1ooVN9Ee2KQc5QIsW97w = new Issue(cache: cache, jsog: jsogObj);
							}
							else {
								valuea3M1ooVN9Ee2KQc5QIsW97w = new Issue(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valuea3M1ooVN9Ee2KQc5QIsW97w = new Issue(cache: cache,jsog: jsogObj);
						}
					}
					this._issues.add(valuea3M1ooVN9Ee2KQc5QIsW97w);
				}
			}
			
			
			_issuesHasBeenSet = false;
			this._preferences = new DIMEList.monitored(preferencesHasBeenSetted);
			if (jsog.containsKey("preferences")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["preferences"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Feature valueamFmoEVMTEe2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueamFmoEVMTEe2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.FeatureImpl") {
								valueamFmoEVMTEe2KQc5QIsW97w = new Feature(cache: cache, jsog: jsogObj);
							}
							else {
								valueamFmoEVMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueamFmoEVMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
						}
					}
					this._preferences.add(valueamFmoEVMTEe2KQc5QIsW97w);
				}
			}
			
			
			_preferencesHasBeenSet = false;
			if (jsog.containsKey("report")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["report"];
				if(jsogObj != null) {
					Report valueanEaTcVGDEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueanEaTcVGDEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.ReportImpl") {
								valueanEaTcVGDEe2J0bu3ffrh5w = new Report(cache: cache, jsog: jsogObj);
							}
							else {
								valueanEaTcVGDEe2J0bu3ffrh5w = new Report(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueanEaTcVGDEe2J0bu3ffrh5w = new Report(cache: cache,jsog: jsogObj);
						}
					}
					this._report = valueanEaTcVGDEe2J0bu3ffrh5w;
				}
			}
			
			
			_reportHasBeenSet = false;
			if (jsog.containsKey("status")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["status"];
				if(jsogObj != null) {
					Status valuea3gXN8XVxEe2cLPYmNcZZ9A;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valuea3gXN8XVxEe2cLPYmNcZZ9A = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.Status") {
								valuea3gXN8XVxEe2cLPYmNcZZ9A = new Status(cache: cache, jsog: jsogObj);
							}
							else {
								valuea3gXN8XVxEe2cLPYmNcZZ9A = new Status(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valuea3gXN8XVxEe2cLPYmNcZZ9A = new Status(cache: cache,jsog: jsogObj);
						}
					}
					this._status = valuea3gXN8XVxEe2cLPYmNcZZ9A;
				}
			}
			
			
			_statusHasBeenSet = false;
			if (jsog.containsKey("title")) {
				core.String jsogObj = jsog["title"];
				if(jsogObj != null) {
					core.String valueaz9pPsVGDEe2J0bu3ffrh5w;
					
					if(jsogObj!=null){
					valueaz9pPsVGDEe2J0bu3ffrh5w = jsogObj.toString();
					}
					this._title = valueaz9pPsVGDEe2J0bu3ffrh5w;
				}
				else {
					this._title = null;
				}
			}
			
			
			else{
				this._title = null;
			}
			_titleHasBeenSet = false;
			if (jsog.containsKey("user")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["user"];
				if(jsogObj != null) {
					User valueaSTTrkVFNEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaSTTrkVFNEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.UserImpl") {
								valueaSTTrkVFNEe2J0bu3ffrh5w = new User(cache: cache, jsog: jsogObj);
							}
							else {
								valueaSTTrkVFNEe2J0bu3ffrh5w = new User(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaSTTrkVFNEe2J0bu3ffrh5w = new User(cache: cache,jsog: jsogObj);
						}
					}
					this._user = valueaSTTrkVFNEe2J0bu3ffrh5w;
				}
			}
			
			
			_userHasBeenSet = false;
			if (jsog.containsKey("userCanDiscuss")) {
				core.bool jsogObj = jsog["userCanDiscuss"];
				if(jsogObj != null) {
					core.bool valuea2bMl8FOhEe2KQc5QIsW97w;
					
					if(jsogObj!=null){
					valuea2bMl8FOhEe2KQc5QIsW97w = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._userCanDiscuss = valuea2bMl8FOhEe2KQc5QIsW97w;
				}
				else {
					this._userCanDiscuss = false;
				}
			}
			
			
			else{
				this._userCanDiscuss = false;
			}
			_userCanDiscussHasBeenSet = false;
		}
	}
	
	void assignedHasBeenSetted() { _assignedHasBeenSet=true; }
	void biddingsHasBeenSetted() { _biddingsHasBeenSet=true; }
	void decisionHasBeenSetted() { _decisionHasBeenSet=true; }
	void descriptionHasBeenSetted() { _descriptionHasBeenSet=true; }
	void featuresHasBeenSetted() { _featuresHasBeenSet=true; }
	void issuesHasBeenSetted() { _issuesHasBeenSet=true; }
	void preferencesHasBeenSetted() { _preferencesHasBeenSet=true; }
	void reportHasBeenSetted() { _reportHasBeenSet=true; }
	void statusHasBeenSetted() { _statusHasBeenSet=true; }
	void titleHasBeenSetted() { _titleHasBeenSet=true; }
	void userHasBeenSetted() { _userHasBeenSet=true; }
	void userCanDiscussHasBeenSetted() { _userCanDiscussHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_assignedHasBeenSet || 
					_biddingsHasBeenSet || 
					_decisionHasBeenSet || 
					_descriptionHasBeenSet || 
					_featuresHasBeenSet || 
					_issuesHasBeenSet || 
					_preferencesHasBeenSet || 
					_reportHasBeenSet || 
					_statusHasBeenSet || 
					_titleHasBeenSet || 
					_userHasBeenSet || 
					_userCanDiscussHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( userHasBeenChanged() && !jsonObj.containsKey('user')) && !objects.containsKey(this._user)) {
			if(this._user != null) {
				jsonObj["user"] = this._user.toJSOG(objects);
			}
			else {
				jsonObj["user"] = null;
			}
			}
			if(( biddingsHasBeenChanged() && !jsonObj.containsKey('biddings'))) {
			if(this._biddings.isEmpty){
				jsonObj["biddings"] = [];
			}
			else{
				jsonObj["biddings"] = this._biddings.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( preferencesHasBeenChanged() && !jsonObj.containsKey('preferences'))) {
			if(this._preferences.isEmpty){
				jsonObj["preferences"] = [];
			}
			else{
				jsonObj["preferences"] = this._preferences.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( featuresHasBeenChanged() && !jsonObj.containsKey('features'))) {
			if(this._features.isEmpty){
				jsonObj["features"] = [];
			}
			else{
				jsonObj["features"] = this._features.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( statusHasBeenChanged() && !jsonObj.containsKey('status')) && !objects.containsKey(this._status)) {
			if(this._status != null) {
				jsonObj["status"] = this._status.toJSOG(objects);
			}
			else {
				jsonObj["status"] = null;
			}
			}
			if(( reportHasBeenChanged() && !jsonObj.containsKey('report')) && !objects.containsKey(this._report)) {
			if(this._report != null) {
				jsonObj["report"] = this._report.toJSOG(objects);
			}
			else {
				jsonObj["report"] = null;
			}
			}
			if(( decisionHasBeenChanged() && !jsonObj.containsKey('decision')) && !objects.containsKey(this._decision)) {
			if(this._decision != null) {
				jsonObj["decision"] = this._decision.toJSOG(objects);
			}
			else {
				jsonObj["decision"] = null;
			}
			}
			if(( issuesHasBeenChanged() && !jsonObj.containsKey('issues'))) {
			if(this._issues.isEmpty){
				jsonObj["issues"] = [];
			}
			else{
				jsonObj["issues"] = this._issues.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( assignedHasBeenChanged() && !jsonObj.containsKey('assigned')) && !objects.containsKey(this._assigned)) {
			jsonObj["assigned"] = this._assigned;
			}
			if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title)) {
			jsonObj["title"] = this._title;
			}
			if(( descriptionHasBeenChanged() && !jsonObj.containsKey('description')) && !objects.containsKey(this._description)) {
			jsonObj["description"] = this._description;
			}
			if(( userCanDiscussHasBeenChanged() && !jsonObj.containsKey('userCanDiscuss')) && !objects.containsKey(this._userCanDiscuss)) {
			jsonObj["userCanDiscuss"] = this._userCanDiscuss;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.OfferImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( userHasBeenChanged() && !jsonObj.containsKey('user')) && !objects.containsKey(this._user) || this.dywa_id == 0) {
		if(this._user != null) {
			jsonObj["user"] = this._user.toJSOG(objects);
		}
		else {
			jsonObj["user"] = null;
		}
		}
		if(( biddingsHasBeenChanged() && !jsonObj.containsKey('biddings')) || this.dywa_id == 0) {
		if(this._biddings.isEmpty){
			jsonObj["biddings"] = [];
		}
		else{
			jsonObj["biddings"] = this._biddings.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( preferencesHasBeenChanged() && !jsonObj.containsKey('preferences')) || this.dywa_id == 0) {
		if(this._preferences.isEmpty){
			jsonObj["preferences"] = [];
		}
		else{
			jsonObj["preferences"] = this._preferences.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( featuresHasBeenChanged() && !jsonObj.containsKey('features')) || this.dywa_id == 0) {
		if(this._features.isEmpty){
			jsonObj["features"] = [];
		}
		else{
			jsonObj["features"] = this._features.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( statusHasBeenChanged() && !jsonObj.containsKey('status')) && !objects.containsKey(this._status) || this.dywa_id == 0) {
		if(this._status != null) {
			jsonObj["status"] = this._status.toJSOG(objects);
		}
		else {
			jsonObj["status"] = null;
		}
		}
		if(( reportHasBeenChanged() && !jsonObj.containsKey('report')) && !objects.containsKey(this._report) || this.dywa_id == 0) {
		if(this._report != null) {
			jsonObj["report"] = this._report.toJSOG(objects);
		}
		else {
			jsonObj["report"] = null;
		}
		}
		if(( decisionHasBeenChanged() && !jsonObj.containsKey('decision')) && !objects.containsKey(this._decision) || this.dywa_id == 0) {
		if(this._decision != null) {
			jsonObj["decision"] = this._decision.toJSOG(objects);
		}
		else {
			jsonObj["decision"] = null;
		}
		}
		if(( issuesHasBeenChanged() && !jsonObj.containsKey('issues')) || this.dywa_id == 0) {
		if(this._issues.isEmpty){
			jsonObj["issues"] = [];
		}
		else{
			jsonObj["issues"] = this._issues.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( assignedHasBeenChanged() && !jsonObj.containsKey('assigned')) && !objects.containsKey(this._assigned) || this.dywa_id == 0) {
		jsonObj["assigned"] = this._assigned;
		}
		if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title) || this.dywa_id == 0) {
		jsonObj["title"] = this._title;
		}
		if(( descriptionHasBeenChanged() && !jsonObj.containsKey('description')) && !objects.containsKey(this._description) || this.dywa_id == 0) {
		jsonObj["description"] = this._description;
		}
		if(( userCanDiscussHasBeenChanged() && !jsonObj.containsKey('userCanDiscuss')) && !objects.containsKey(this._userCanDiscuss) || this.dywa_id == 0) {
		jsonObj["userCanDiscuss"] = this._userCanDiscuss;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Offer fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.OfferImpl') {
			return new Offer(cache:cache,jsog:jsog);
		}
		return new Offer(cache:cache,jsog:jsog);
	}
	
	void set user (User value)
	{
		this._userHasBeenSet = true;
		this._user = value;
	}
	
	User get user
	{
		return this._user;
	}
	
		User initOnDemanduser()
		{
			if(this._user == null) {
			this.user = new User();
			}
			return this.user;
		}
		
		void setValueuser(User value)
		{
			this.user = value;
		}
		
		void usersetValue(User value)
		{
			this.user = value;
		}
		
	
	void set biddings (DIMEList<Bidding> value)
	{
		this._biddingsHasBeenSet = true;
		this._biddings = value;
	}
	
	DIMEList<Bidding> get biddings
	{
		return this._biddings;
	}
	
		DIMEList<Bidding> initOnDemandbiddings()
		{
			if(this._biddings == null) {
			this._biddings = new DIMEList();
			}
			return this.biddings;
		}
		
		void setValuebiddings(DIMEList<Bidding> value)
		{
			this.biddings = value;
		}
		
		void biddingssetValue(DIMEList<Bidding> value)
		{
			this.biddings = value;
		}
		
		void biddingsadd(Bidding value)
		{
			this.biddings.add(value);
			this._biddingsHasBeenSet = true;
		}

	
	void set preferences (DIMEList<Feature> value)
	{
		this._preferencesHasBeenSet = true;
		this._preferences = value;
	}
	
	DIMEList<Feature> get preferences
	{
		return this._preferences;
	}
	
		DIMEList<Feature> initOnDemandpreferences()
		{
			if(this._preferences == null) {
			this._preferences = new DIMEList();
			}
			return this.preferences;
		}
		
		void setValuepreferences(DIMEList<Feature> value)
		{
			this.preferences = value;
		}
		
		void preferencessetValue(DIMEList<Feature> value)
		{
			this.preferences = value;
		}
		
		void preferencesadd(Feature value)
		{
			this.preferences.add(value);
			this._preferencesHasBeenSet = true;
		}

	
	void set features (DIMEList<Feature> value)
	{
		this._featuresHasBeenSet = true;
		this._features = value;
	}
	
	DIMEList<Feature> get features
	{
		return this._features;
	}
	
		DIMEList<Feature> initOnDemandfeatures()
		{
			if(this._features == null) {
			this._features = new DIMEList();
			}
			return this.features;
		}
		
		void setValuefeatures(DIMEList<Feature> value)
		{
			this.features = value;
		}
		
		void featuressetValue(DIMEList<Feature> value)
		{
			this.features = value;
		}
		
		void featuresadd(Feature value)
		{
			this.features.add(value);
			this._featuresHasBeenSet = true;
		}

	
	void set status (Status value)
	{
		this._statusHasBeenSet = true;
		this._status = value;
	}
	
	Status get status
	{
		return this._status;
	}
	
		Status initOnDemandstatus()
		{
			if(this._status == null) {
			this.status = new Status();
			}
			return this.status;
		}
		
		void setValuestatus(Status value)
		{
			this.status = value;
		}
		
		void statussetValue(Status value)
		{
			this.status = value;
		}
		
	
	void set report (Report value)
	{
		this._reportHasBeenSet = true;
		this._report = value;
	}
	
	Report get report
	{
		return this._report;
	}
	
		Report initOnDemandreport()
		{
			if(this._report == null) {
			this.report = new Report();
			}
			return this.report;
		}
		
		void setValuereport(Report value)
		{
			this.report = value;
		}
		
		void reportsetValue(Report value)
		{
			this.report = value;
		}
		
	
	void set decision (Decision value)
	{
		this._decisionHasBeenSet = true;
		this._decision = value;
	}
	
	Decision get decision
	{
		return this._decision;
	}
	
		Decision initOnDemanddecision()
		{
			if(this._decision == null) {
			this.decision = new Decision();
			}
			return this.decision;
		}
		
		void setValuedecision(Decision value)
		{
			this.decision = value;
		}
		
		void decisionsetValue(Decision value)
		{
			this.decision = value;
		}
		
	
	void set issues (DIMEList<Issue> value)
	{
		this._issuesHasBeenSet = true;
		this._issues = value;
	}
	
	DIMEList<Issue> get issues
	{
		return this._issues;
	}
	
		DIMEList<Issue> initOnDemandissues()
		{
			if(this._issues == null) {
			this._issues = new DIMEList();
			}
			return this.issues;
		}
		
		void setValueissues(DIMEList<Issue> value)
		{
			this.issues = value;
		}
		
		void issuessetValue(DIMEList<Issue> value)
		{
			this.issues = value;
		}
		
		void issuesadd(Issue value)
		{
			this.issues.add(value);
			this._issuesHasBeenSet = true;
		}

	
	void set assigned (core.bool value)
	{
		this._assignedHasBeenSet = true;
		this._assigned = value;
	}
	
	core.bool get assigned
	{
		return this._assigned;
	}
	
		core.bool initOnDemandassigned()
		{
			return this.assigned;
		}
		
		void setValueassigned(core.bool value)
		{
			this.assigned = value;
		}
		
		void assignedsetValue(core.bool value)
		{
			this.assigned = value;
		}
		
	
	void set title (core.String value)
	{
		this._titleHasBeenSet = true;
		this._title = value;
	}
	
	core.String get title
	{
		return this._title;
	}
	
		core.String initOnDemandtitle()
		{
			return this.title;
		}
		
		void setValuetitle(core.String value)
		{
			this.title = value;
		}
		
		void titlesetValue(core.String value)
		{
			this.title = value;
		}
		
	
	void set description (core.String value)
	{
		this._descriptionHasBeenSet = true;
		this._description = value;
	}
	
	core.String get description
	{
		return this._description;
	}
	
		core.String initOnDemanddescription()
		{
			return this.description;
		}
		
		void setValuedescription(core.String value)
		{
			this.description = value;
		}
		
		void descriptionsetValue(core.String value)
		{
			this.description = value;
		}
		
	
	void set userCanDiscuss (core.bool value)
	{
		this._userCanDiscussHasBeenSet = true;
		this._userCanDiscuss = value;
	}
	
	core.bool get userCanDiscuss
	{
		return this._userCanDiscuss;
	}
	
		core.bool initOnDemanduserCanDiscuss()
		{
			return this.userCanDiscuss;
		}
		
		void setValueuserCanDiscuss(core.bool value)
		{
			this.userCanDiscuss = value;
		}
		
		void userCanDiscusssetValue(core.bool value)
		{
			this.userCanDiscuss = value;
		}
		
	
}

class Bidding extends BaseModel implements Submission
{
	core.bool _assignedHasBeenSet = false;
	core.bool assignedHasBeenChanged() => _assignedHasBeenSet;
	core.bool _assigned;
	core.bool _decisionHasBeenSet = false;
	core.bool decisionHasBeenChanged() => _decisionHasBeenSet||(_decision==null?false:_decision.hasChanged()) ;
	Decision _decision;
	core.bool _descriptionHasBeenSet = false;
	core.bool descriptionHasBeenChanged() => _descriptionHasBeenSet;
	core.String _description;
	core.bool _featuresHasBeenSet = false;
	core.bool featuresHasBeenChanged() => _featuresHasBeenSet;
	DIMEList<Feature> _features;
	core.bool _issuesHasBeenSet = false;
	core.bool issuesHasBeenChanged() => _issuesHasBeenSet;
	DIMEList<Issue> _issues;
	core.bool _offerHasBeenSet = false;
	core.bool offerHasBeenChanged() => _offerHasBeenSet||(_offer==null?false:_offer.hasChanged()) ;
	Offer _offer;
	core.bool _preferencesHasBeenSet = false;
	core.bool preferencesHasBeenChanged() => _preferencesHasBeenSet;
	DIMEList<Feature> _preferences;
	core.bool _reportHasBeenSet = false;
	core.bool reportHasBeenChanged() => _reportHasBeenSet||(_report==null?false:_report.hasChanged()) ;
	Report _report;
	core.bool _statusHasBeenSet = false;
	core.bool statusHasBeenChanged() => _statusHasBeenSet||(_status==null?false:_status.hasChanged()) ;
	Status _status;
	core.bool _titleHasBeenSet = false;
	core.bool titleHasBeenChanged() => _titleHasBeenSet;
	core.String _title;
	core.bool _userHasBeenSet = false;
	core.bool userHasBeenChanged() => _userHasBeenSet||(_user==null?false:_user.hasChanged()) ;
	User _user;
	core.bool _userCanDiscussHasBeenSet = false;
	core.bool userCanDiscussHasBeenChanged() => _userCanDiscussHasBeenSet;
	core.bool _userCanDiscuss;
	
	static Bidding fromId(core.int id) {
		var m = new Bidding();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'assigned': this.assigned, 
	  'decision': this.decision, 
	  'description': this.description, 
	  'features': this.features, 
	  'issues': this.issues, 
	  'offer': this.offer, 
	  'preferences': this.preferences, 
	  'report': this.report, 
	  'status': this.status, 
	  'title': this.title, 
	  'user': this.user, 
	  'userCanDiscuss': this.userCanDiscuss
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'assigned': this.assigned = value; return;
	  case 'decision': this.decision = value; return;
	  case 'description': this.description = value; return;
	  case 'features': this.features = value; return;
	  case 'issues': this.issues = value; return;
	  case 'offer': this.offer = value; return;
	  case 'preferences': this.preferences = value; return;
	  case 'report': this.report = value; return;
	  case 'status': this.status = value; return;
	  case 'title': this.title = value; return;
	  case 'user': this.user = value; return;
	  case 'userCanDiscuss': this.userCanDiscuss = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Bidding({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._assigned = false;
			this._description = null;
			this._features = new DIMEList.monitored(featuresHasBeenSetted);
			this._issues = new DIMEList.monitored(issuesHasBeenSetted);
			this._preferences = new DIMEList.monitored(preferencesHasBeenSetted);
			this._title = null;
			this._userCanDiscuss = false;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("assigned")) {
				core.bool jsogObj = jsog["assigned"];
				if(jsogObj != null) {
					core.bool valueaynLkUVGJEe2J0bu3ffrh5w;
					
					if(jsogObj!=null){
					valueaynLkUVGJEe2J0bu3ffrh5w = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._assigned = valueaynLkUVGJEe2J0bu3ffrh5w;
				}
				else {
					this._assigned = false;
				}
			}
			
			
			else{
				this._assigned = false;
			}
			_assignedHasBeenSet = false;
			if (jsog.containsKey("decision")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["decision"];
				if(jsogObj != null) {
					Decision valueanrhWwVGDEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueanrhWwVGDEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.DecisionImpl") {
								valueanrhWwVGDEe2J0bu3ffrh5w = new Decision(cache: cache, jsog: jsogObj);
							}
							else {
								valueanrhWwVGDEe2J0bu3ffrh5w = new Decision(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueanrhWwVGDEe2J0bu3ffrh5w = new Decision(cache: cache,jsog: jsogObj);
						}
					}
					this._decision = valueanrhWwVGDEe2J0bu3ffrh5w;
				}
			}
			
			
			_decisionHasBeenSet = false;
			if (jsog.containsKey("description")) {
				core.String jsogObj = jsog["description"];
				if(jsogObj != null) {
					core.String valueasr08AXigEe2n6qlSkDlEsw;
					
					if(jsogObj!=null){
					valueasr08AXigEe2n6qlSkDlEsw = jsogObj.toString();
					}
					this._description = valueasr08AXigEe2n6qlSkDlEsw;
				}
				else {
					this._description = null;
				}
			}
			
			
			else{
				this._description = null;
			}
			_descriptionHasBeenSet = false;
			this._features = new DIMEList.monitored(featuresHasBeenSetted);
			if (jsog.containsKey("features")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["features"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Feature valueaxMbLgVMTEe2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaxMbLgVMTEe2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.FeatureImpl") {
								valueaxMbLgVMTEe2KQc5QIsW97w = new Feature(cache: cache, jsog: jsogObj);
							}
							else {
								valueaxMbLgVMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaxMbLgVMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
						}
					}
					this._features.add(valueaxMbLgVMTEe2KQc5QIsW97w);
				}
			}
			
			
			_featuresHasBeenSet = false;
			this._issues = new DIMEList.monitored(issuesHasBeenSetted);
			if (jsog.containsKey("issues")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["issues"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Issue valuea3M1ooVN9Ee2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valuea3M1ooVN9Ee2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.IssueImpl") {
								valuea3M1ooVN9Ee2KQc5QIsW97w = new Issue(cache: cache, jsog: jsogObj);
							}
							else {
								valuea3M1ooVN9Ee2KQc5QIsW97w = new Issue(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valuea3M1ooVN9Ee2KQc5QIsW97w = new Issue(cache: cache,jsog: jsogObj);
						}
					}
					this._issues.add(valuea3M1ooVN9Ee2KQc5QIsW97w);
				}
			}
			
			
			_issuesHasBeenSet = false;
			if (jsog.containsKey("offer")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["offer"];
				if(jsogObj != null) {
					Offer valueaxY5BsVGIEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaxY5BsVGIEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.OfferImpl") {
								valueaxY5BsVGIEe2J0bu3ffrh5w = new Offer(cache: cache, jsog: jsogObj);
							}
							else {
								valueaxY5BsVGIEe2J0bu3ffrh5w = new Offer(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaxY5BsVGIEe2J0bu3ffrh5w = new Offer(cache: cache,jsog: jsogObj);
						}
					}
					this._offer = valueaxY5BsVGIEe2J0bu3ffrh5w;
				}
			}
			
			
			_offerHasBeenSet = false;
			this._preferences = new DIMEList.monitored(preferencesHasBeenSetted);
			if (jsog.containsKey("preferences")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["preferences"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Feature valuea0_2Z0VMTEe2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valuea0_2Z0VMTEe2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.FeatureImpl") {
								valuea0_2Z0VMTEe2KQc5QIsW97w = new Feature(cache: cache, jsog: jsogObj);
							}
							else {
								valuea0_2Z0VMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valuea0_2Z0VMTEe2KQc5QIsW97w = new Feature(cache: cache,jsog: jsogObj);
						}
					}
					this._preferences.add(valuea0_2Z0VMTEe2KQc5QIsW97w);
				}
			}
			
			
			_preferencesHasBeenSet = false;
			if (jsog.containsKey("report")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["report"];
				if(jsogObj != null) {
					Report valueanEaTcVGDEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueanEaTcVGDEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.ReportImpl") {
								valueanEaTcVGDEe2J0bu3ffrh5w = new Report(cache: cache, jsog: jsogObj);
							}
							else {
								valueanEaTcVGDEe2J0bu3ffrh5w = new Report(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueanEaTcVGDEe2J0bu3ffrh5w = new Report(cache: cache,jsog: jsogObj);
						}
					}
					this._report = valueanEaTcVGDEe2J0bu3ffrh5w;
				}
			}
			
			
			_reportHasBeenSet = false;
			if (jsog.containsKey("status")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["status"];
				if(jsogObj != null) {
					Status valuea6kjXsXVxEe2cLPYmNcZZ9A;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valuea6kjXsXVxEe2cLPYmNcZZ9A = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.Status") {
								valuea6kjXsXVxEe2cLPYmNcZZ9A = new Status(cache: cache, jsog: jsogObj);
							}
							else {
								valuea6kjXsXVxEe2cLPYmNcZZ9A = new Status(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valuea6kjXsXVxEe2cLPYmNcZZ9A = new Status(cache: cache,jsog: jsogObj);
						}
					}
					this._status = valuea6kjXsXVxEe2cLPYmNcZZ9A;
				}
			}
			
			
			_statusHasBeenSet = false;
			if (jsog.containsKey("title")) {
				core.String jsogObj = jsog["title"];
				if(jsogObj != null) {
					core.String valueaz9pPsVGDEe2J0bu3ffrh5w;
					
					if(jsogObj!=null){
					valueaz9pPsVGDEe2J0bu3ffrh5w = jsogObj.toString();
					}
					this._title = valueaz9pPsVGDEe2J0bu3ffrh5w;
				}
				else {
					this._title = null;
				}
			}
			
			
			else{
				this._title = null;
			}
			_titleHasBeenSet = false;
			if (jsog.containsKey("user")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["user"];
				if(jsogObj != null) {
					User valueaT0d8UVFNEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaT0d8UVFNEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.UserImpl") {
								valueaT0d8UVFNEe2J0bu3ffrh5w = new User(cache: cache, jsog: jsogObj);
							}
							else {
								valueaT0d8UVFNEe2J0bu3ffrh5w = new User(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaT0d8UVFNEe2J0bu3ffrh5w = new User(cache: cache,jsog: jsogObj);
						}
					}
					this._user = valueaT0d8UVFNEe2J0bu3ffrh5w;
				}
			}
			
			
			_userHasBeenSet = false;
			if (jsog.containsKey("userCanDiscuss")) {
				core.bool jsogObj = jsog["userCanDiscuss"];
				if(jsogObj != null) {
					core.bool valuea2bMl8FOhEe2KQc5QIsW97w;
					
					if(jsogObj!=null){
					valuea2bMl8FOhEe2KQc5QIsW97w = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._userCanDiscuss = valuea2bMl8FOhEe2KQc5QIsW97w;
				}
				else {
					this._userCanDiscuss = false;
				}
			}
			
			
			else{
				this._userCanDiscuss = false;
			}
			_userCanDiscussHasBeenSet = false;
		}
	}
	
	void assignedHasBeenSetted() { _assignedHasBeenSet=true; }
	void decisionHasBeenSetted() { _decisionHasBeenSet=true; }
	void descriptionHasBeenSetted() { _descriptionHasBeenSet=true; }
	void featuresHasBeenSetted() { _featuresHasBeenSet=true; }
	void issuesHasBeenSetted() { _issuesHasBeenSet=true; }
	void offerHasBeenSetted() { _offerHasBeenSet=true; }
	void preferencesHasBeenSetted() { _preferencesHasBeenSet=true; }
	void reportHasBeenSetted() { _reportHasBeenSet=true; }
	void statusHasBeenSetted() { _statusHasBeenSet=true; }
	void titleHasBeenSetted() { _titleHasBeenSet=true; }
	void userHasBeenSetted() { _userHasBeenSet=true; }
	void userCanDiscussHasBeenSetted() { _userCanDiscussHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_assignedHasBeenSet || 
					_decisionHasBeenSet || 
					_descriptionHasBeenSet || 
					_featuresHasBeenSet || 
					_issuesHasBeenSet || 
					_offerHasBeenSet || 
					_preferencesHasBeenSet || 
					_reportHasBeenSet || 
					_statusHasBeenSet || 
					_titleHasBeenSet || 
					_userHasBeenSet || 
					_userCanDiscussHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( userHasBeenChanged() && !jsonObj.containsKey('user')) && !objects.containsKey(this._user)) {
			if(this._user != null) {
				jsonObj["user"] = this._user.toJSOG(objects);
			}
			else {
				jsonObj["user"] = null;
			}
			}
			if(( offerHasBeenChanged() && !jsonObj.containsKey('offer')) && !objects.containsKey(this._offer)) {
			if(this._offer != null) {
				jsonObj["offer"] = this._offer.toJSOG(objects);
			}
			else {
				jsonObj["offer"] = null;
			}
			}
			if(( featuresHasBeenChanged() && !jsonObj.containsKey('features'))) {
			if(this._features.isEmpty){
				jsonObj["features"] = [];
			}
			else{
				jsonObj["features"] = this._features.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( preferencesHasBeenChanged() && !jsonObj.containsKey('preferences'))) {
			if(this._preferences.isEmpty){
				jsonObj["preferences"] = [];
			}
			else{
				jsonObj["preferences"] = this._preferences.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( statusHasBeenChanged() && !jsonObj.containsKey('status')) && !objects.containsKey(this._status)) {
			if(this._status != null) {
				jsonObj["status"] = this._status.toJSOG(objects);
			}
			else {
				jsonObj["status"] = null;
			}
			}
			if(( reportHasBeenChanged() && !jsonObj.containsKey('report')) && !objects.containsKey(this._report)) {
			if(this._report != null) {
				jsonObj["report"] = this._report.toJSOG(objects);
			}
			else {
				jsonObj["report"] = null;
			}
			}
			if(( decisionHasBeenChanged() && !jsonObj.containsKey('decision')) && !objects.containsKey(this._decision)) {
			if(this._decision != null) {
				jsonObj["decision"] = this._decision.toJSOG(objects);
			}
			else {
				jsonObj["decision"] = null;
			}
			}
			if(( issuesHasBeenChanged() && !jsonObj.containsKey('issues'))) {
			if(this._issues.isEmpty){
				jsonObj["issues"] = [];
			}
			else{
				jsonObj["issues"] = this._issues.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( assignedHasBeenChanged() && !jsonObj.containsKey('assigned')) && !objects.containsKey(this._assigned)) {
			jsonObj["assigned"] = this._assigned;
			}
			if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title)) {
			jsonObj["title"] = this._title;
			}
			if(( descriptionHasBeenChanged() && !jsonObj.containsKey('description')) && !objects.containsKey(this._description)) {
			jsonObj["description"] = this._description;
			}
			if(( userCanDiscussHasBeenChanged() && !jsonObj.containsKey('userCanDiscuss')) && !objects.containsKey(this._userCanDiscuss)) {
			jsonObj["userCanDiscuss"] = this._userCanDiscuss;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.BiddingImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( userHasBeenChanged() && !jsonObj.containsKey('user')) && !objects.containsKey(this._user) || this.dywa_id == 0) {
		if(this._user != null) {
			jsonObj["user"] = this._user.toJSOG(objects);
		}
		else {
			jsonObj["user"] = null;
		}
		}
		if(( offerHasBeenChanged() && !jsonObj.containsKey('offer')) && !objects.containsKey(this._offer) || this.dywa_id == 0) {
		if(this._offer != null) {
			jsonObj["offer"] = this._offer.toJSOG(objects);
		}
		else {
			jsonObj["offer"] = null;
		}
		}
		if(( featuresHasBeenChanged() && !jsonObj.containsKey('features')) || this.dywa_id == 0) {
		if(this._features.isEmpty){
			jsonObj["features"] = [];
		}
		else{
			jsonObj["features"] = this._features.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( preferencesHasBeenChanged() && !jsonObj.containsKey('preferences')) || this.dywa_id == 0) {
		if(this._preferences.isEmpty){
			jsonObj["preferences"] = [];
		}
		else{
			jsonObj["preferences"] = this._preferences.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( statusHasBeenChanged() && !jsonObj.containsKey('status')) && !objects.containsKey(this._status) || this.dywa_id == 0) {
		if(this._status != null) {
			jsonObj["status"] = this._status.toJSOG(objects);
		}
		else {
			jsonObj["status"] = null;
		}
		}
		if(( reportHasBeenChanged() && !jsonObj.containsKey('report')) && !objects.containsKey(this._report) || this.dywa_id == 0) {
		if(this._report != null) {
			jsonObj["report"] = this._report.toJSOG(objects);
		}
		else {
			jsonObj["report"] = null;
		}
		}
		if(( decisionHasBeenChanged() && !jsonObj.containsKey('decision')) && !objects.containsKey(this._decision) || this.dywa_id == 0) {
		if(this._decision != null) {
			jsonObj["decision"] = this._decision.toJSOG(objects);
		}
		else {
			jsonObj["decision"] = null;
		}
		}
		if(( issuesHasBeenChanged() && !jsonObj.containsKey('issues')) || this.dywa_id == 0) {
		if(this._issues.isEmpty){
			jsonObj["issues"] = [];
		}
		else{
			jsonObj["issues"] = this._issues.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( assignedHasBeenChanged() && !jsonObj.containsKey('assigned')) && !objects.containsKey(this._assigned) || this.dywa_id == 0) {
		jsonObj["assigned"] = this._assigned;
		}
		if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title) || this.dywa_id == 0) {
		jsonObj["title"] = this._title;
		}
		if(( descriptionHasBeenChanged() && !jsonObj.containsKey('description')) && !objects.containsKey(this._description) || this.dywa_id == 0) {
		jsonObj["description"] = this._description;
		}
		if(( userCanDiscussHasBeenChanged() && !jsonObj.containsKey('userCanDiscuss')) && !objects.containsKey(this._userCanDiscuss) || this.dywa_id == 0) {
		jsonObj["userCanDiscuss"] = this._userCanDiscuss;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Bidding fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.BiddingImpl') {
			return new Bidding(cache:cache,jsog:jsog);
		}
		return new Bidding(cache:cache,jsog:jsog);
	}
	
	void set user (User value)
	{
		this._userHasBeenSet = true;
		this._user = value;
	}
	
	User get user
	{
		return this._user;
	}
	
		User initOnDemanduser()
		{
			if(this._user == null) {
			this.user = new User();
			}
			return this.user;
		}
		
		void setValueuser(User value)
		{
			this.user = value;
		}
		
		void usersetValue(User value)
		{
			this.user = value;
		}
		
	
	void set offer (Offer value)
	{
		this._offerHasBeenSet = true;
		this._offer = value;
	}
	
	Offer get offer
	{
		return this._offer;
	}
	
		Offer initOnDemandoffer()
		{
			if(this._offer == null) {
			this.offer = new Offer();
			}
			return this.offer;
		}
		
		void setValueoffer(Offer value)
		{
			this.offer = value;
		}
		
		void offersetValue(Offer value)
		{
			this.offer = value;
		}
		
	
	void set features (DIMEList<Feature> value)
	{
		this._featuresHasBeenSet = true;
		this._features = value;
	}
	
	DIMEList<Feature> get features
	{
		return this._features;
	}
	
		DIMEList<Feature> initOnDemandfeatures()
		{
			if(this._features == null) {
			this._features = new DIMEList();
			}
			return this.features;
		}
		
		void setValuefeatures(DIMEList<Feature> value)
		{
			this.features = value;
		}
		
		void featuressetValue(DIMEList<Feature> value)
		{
			this.features = value;
		}
		
		void featuresadd(Feature value)
		{
			this.features.add(value);
			this._featuresHasBeenSet = true;
		}

	
	void set preferences (DIMEList<Feature> value)
	{
		this._preferencesHasBeenSet = true;
		this._preferences = value;
	}
	
	DIMEList<Feature> get preferences
	{
		return this._preferences;
	}
	
		DIMEList<Feature> initOnDemandpreferences()
		{
			if(this._preferences == null) {
			this._preferences = new DIMEList();
			}
			return this.preferences;
		}
		
		void setValuepreferences(DIMEList<Feature> value)
		{
			this.preferences = value;
		}
		
		void preferencessetValue(DIMEList<Feature> value)
		{
			this.preferences = value;
		}
		
		void preferencesadd(Feature value)
		{
			this.preferences.add(value);
			this._preferencesHasBeenSet = true;
		}

	
	void set status (Status value)
	{
		this._statusHasBeenSet = true;
		this._status = value;
	}
	
	Status get status
	{
		return this._status;
	}
	
		Status initOnDemandstatus()
		{
			if(this._status == null) {
			this.status = new Status();
			}
			return this.status;
		}
		
		void setValuestatus(Status value)
		{
			this.status = value;
		}
		
		void statussetValue(Status value)
		{
			this.status = value;
		}
		
	
	void set report (Report value)
	{
		this._reportHasBeenSet = true;
		this._report = value;
	}
	
	Report get report
	{
		return this._report;
	}
	
		Report initOnDemandreport()
		{
			if(this._report == null) {
			this.report = new Report();
			}
			return this.report;
		}
		
		void setValuereport(Report value)
		{
			this.report = value;
		}
		
		void reportsetValue(Report value)
		{
			this.report = value;
		}
		
	
	void set decision (Decision value)
	{
		this._decisionHasBeenSet = true;
		this._decision = value;
	}
	
	Decision get decision
	{
		return this._decision;
	}
	
		Decision initOnDemanddecision()
		{
			if(this._decision == null) {
			this.decision = new Decision();
			}
			return this.decision;
		}
		
		void setValuedecision(Decision value)
		{
			this.decision = value;
		}
		
		void decisionsetValue(Decision value)
		{
			this.decision = value;
		}
		
	
	void set issues (DIMEList<Issue> value)
	{
		this._issuesHasBeenSet = true;
		this._issues = value;
	}
	
	DIMEList<Issue> get issues
	{
		return this._issues;
	}
	
		DIMEList<Issue> initOnDemandissues()
		{
			if(this._issues == null) {
			this._issues = new DIMEList();
			}
			return this.issues;
		}
		
		void setValueissues(DIMEList<Issue> value)
		{
			this.issues = value;
		}
		
		void issuessetValue(DIMEList<Issue> value)
		{
			this.issues = value;
		}
		
		void issuesadd(Issue value)
		{
			this.issues.add(value);
			this._issuesHasBeenSet = true;
		}

	
	void set assigned (core.bool value)
	{
		this._assignedHasBeenSet = true;
		this._assigned = value;
	}
	
	core.bool get assigned
	{
		return this._assigned;
	}
	
		core.bool initOnDemandassigned()
		{
			return this.assigned;
		}
		
		void setValueassigned(core.bool value)
		{
			this.assigned = value;
		}
		
		void assignedsetValue(core.bool value)
		{
			this.assigned = value;
		}
		
	
	void set title (core.String value)
	{
		this._titleHasBeenSet = true;
		this._title = value;
	}
	
	core.String get title
	{
		return this._title;
	}
	
		core.String initOnDemandtitle()
		{
			return this.title;
		}
		
		void setValuetitle(core.String value)
		{
			this.title = value;
		}
		
		void titlesetValue(core.String value)
		{
			this.title = value;
		}
		
	
	void set description (core.String value)
	{
		this._descriptionHasBeenSet = true;
		this._description = value;
	}
	
	core.String get description
	{
		return this._description;
	}
	
		core.String initOnDemanddescription()
		{
			return this.description;
		}
		
		void setValuedescription(core.String value)
		{
			this.description = value;
		}
		
		void descriptionsetValue(core.String value)
		{
			this.description = value;
		}
		
	
	void set userCanDiscuss (core.bool value)
	{
		this._userCanDiscussHasBeenSet = true;
		this._userCanDiscuss = value;
	}
	
	core.bool get userCanDiscuss
	{
		return this._userCanDiscuss;
	}
	
		core.bool initOnDemanduserCanDiscuss()
		{
			return this.userCanDiscuss;
		}
		
		void setValueuserCanDiscuss(core.bool value)
		{
			this.userCanDiscuss = value;
		}
		
		void userCanDiscusssetValue(core.bool value)
		{
			this.userCanDiscuss = value;
		}
		
	
}

class Report extends BaseModel
{
	
	static Report fromId(core.int id) {
		var m = new Report();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Report({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
		}
	}
	
	
	core.bool hasChanged() {
		return false
;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.ReportImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Report fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.ReportImpl') {
			return new Report(cache:cache,jsog:jsog);
		}
		return new Report(cache:cache,jsog:jsog);
	}
	
}

class DecisionState extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static DecisionState fromId(core.int id) {
		var m = new DecisionState();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	DecisionState({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaMs5tIXmkEe2ix_xiis0jnw;
					
					if(jsogObj!=null){
					valueaMs5tIXmkEe2ix_xiis0jnw = jsogObj.toString();
					}
					this._dywaDisplayName = valueaMs5tIXmkEe2ix_xiis0jnw;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'approved':
				return "approved";
			case 'rejected':
				return "rejected";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.DecisionState";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static DecisionState fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.DecisionState') {
			return new DecisionState(cache:cache,jsog:jsog);
		}
		return new DecisionState(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}

class Decision extends BaseModel
{
	core.bool _stateHasBeenSet = false;
	core.bool stateHasBeenChanged() => _stateHasBeenSet||(_state==null?false:_state.hasChanged()) ;
	DecisionState _state;
	
	static Decision fromId(core.int id) {
		var m = new Decision();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'state': this.state
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'state': this.state = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Decision({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("state")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["state"];
				if(jsogObj != null) {
					DecisionState valueaFOudUVGBEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaFOudUVGBEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.DecisionState") {
								valueaFOudUVGBEe2J0bu3ffrh5w = new DecisionState(cache: cache, jsog: jsogObj);
							}
							else {
								valueaFOudUVGBEe2J0bu3ffrh5w = new DecisionState(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaFOudUVGBEe2J0bu3ffrh5w = new DecisionState(cache: cache,jsog: jsogObj);
						}
					}
					this._state = valueaFOudUVGBEe2J0bu3ffrh5w;
				}
			}
			
			
			_stateHasBeenSet = false;
		}
	}
	
	void stateHasBeenSetted() { _stateHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_stateHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( stateHasBeenChanged() && !jsonObj.containsKey('state')) && !objects.containsKey(this._state)) {
			if(this._state != null) {
				jsonObj["state"] = this._state.toJSOG(objects);
			}
			else {
				jsonObj["state"] = null;
			}
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.DecisionImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( stateHasBeenChanged() && !jsonObj.containsKey('state')) && !objects.containsKey(this._state) || this.dywa_id == 0) {
		if(this._state != null) {
			jsonObj["state"] = this._state.toJSOG(objects);
		}
		else {
			jsonObj["state"] = null;
		}
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Decision fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.DecisionImpl') {
			return new Decision(cache:cache,jsog:jsog);
		}
		return new Decision(cache:cache,jsog:jsog);
	}
	
	void set state (DecisionState value)
	{
		this._stateHasBeenSet = true;
		this._state = value;
	}
	
	DecisionState get state
	{
		return this._state;
	}
	
		DecisionState initOnDemandstate()
		{
			if(this._state == null) {
			this.state = new DecisionState();
			}
			return this.state;
		}
		
		void setValuestate(DecisionState value)
		{
			this.state = value;
		}
		
		void statesetValue(DecisionState value)
		{
			this.state = value;
		}
		
	
}

abstract class Submission extends BaseModel
{
	core.bool _decisionHasBeenSet = false;
	core.bool decisionHasBeenChanged() => _decisionHasBeenSet||(_decision==null?false:_decision.hasChanged()) ;
	Decision _decision;
	core.bool _descriptionHasBeenSet = false;
	core.bool descriptionHasBeenChanged() => _descriptionHasBeenSet;
	core.String _description;
	core.bool _issuesHasBeenSet = false;
	core.bool issuesHasBeenChanged() => _issuesHasBeenSet;
	DIMEList<Issue> _issues;
	core.bool _reportHasBeenSet = false;
	core.bool reportHasBeenChanged() => _reportHasBeenSet||(_report==null?false:_report.hasChanged()) ;
	Report _report;
	core.bool _titleHasBeenSet = false;
	core.bool titleHasBeenChanged() => _titleHasBeenSet;
	core.String _title;
	core.bool _userCanDiscussHasBeenSet = false;
	core.bool userCanDiscussHasBeenChanged() => _userCanDiscussHasBeenSet;
	core.bool _userCanDiscuss;
	
	static ParameterBaseModel fromId(core.int id) {
		var m = new ParameterBaseModel();
		m.dywaRuntimeType = "de.ls5.dywa.generated.rest.types.SubmissionImpl";
		m.dywa_id = id;
		return m;
	}
	
	
	void decisionHasBeenSetted() { _decisionHasBeenSet=true; }
	void descriptionHasBeenSetted() { _descriptionHasBeenSet=true; }
	void issuesHasBeenSetted() { _issuesHasBeenSet=true; }
	void reportHasBeenSetted() { _reportHasBeenSet=true; }
	void titleHasBeenSetted() { _titleHasBeenSet=true; }
	void userCanDiscussHasBeenSetted() { _userCanDiscussHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_decisionHasBeenSet || 
					_descriptionHasBeenSet || 
					_issuesHasBeenSet || 
					_reportHasBeenSet || 
					_titleHasBeenSet || 
					_userCanDiscussHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( reportHasBeenChanged() && !jsonObj.containsKey('report')) && !objects.containsKey(this._report)) {
			if(this._report != null) {
				jsonObj["report"] = this._report.toJSOG(objects);
			}
			else {
				jsonObj["report"] = null;
			}
			}
			if(( decisionHasBeenChanged() && !jsonObj.containsKey('decision')) && !objects.containsKey(this._decision)) {
			if(this._decision != null) {
				jsonObj["decision"] = this._decision.toJSOG(objects);
			}
			else {
				jsonObj["decision"] = null;
			}
			}
			if(( issuesHasBeenChanged() && !jsonObj.containsKey('issues'))) {
			if(this._issues.isEmpty){
				jsonObj["issues"] = [];
			}
			else{
				jsonObj["issues"] = this._issues.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title)) {
			jsonObj["title"] = this._title;
			}
			if(( descriptionHasBeenChanged() && !jsonObj.containsKey('description')) && !objects.containsKey(this._description)) {
			jsonObj["description"] = this._description;
			}
			if(( userCanDiscussHasBeenChanged() && !jsonObj.containsKey('userCanDiscuss')) && !objects.containsKey(this._userCanDiscuss)) {
			jsonObj["userCanDiscuss"] = this._userCanDiscuss;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.SubmissionImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( reportHasBeenChanged() && !jsonObj.containsKey('report')) && !objects.containsKey(this._report) || this.dywa_id == 0) {
		if(this._report != null) {
			jsonObj["report"] = this._report.toJSOG(objects);
		}
		else {
			jsonObj["report"] = null;
		}
		}
		if(( decisionHasBeenChanged() && !jsonObj.containsKey('decision')) && !objects.containsKey(this._decision) || this.dywa_id == 0) {
		if(this._decision != null) {
			jsonObj["decision"] = this._decision.toJSOG(objects);
		}
		else {
			jsonObj["decision"] = null;
		}
		}
		if(( issuesHasBeenChanged() && !jsonObj.containsKey('issues')) || this.dywa_id == 0) {
		if(this._issues.isEmpty){
			jsonObj["issues"] = [];
		}
		else{
			jsonObj["issues"] = this._issues.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title) || this.dywa_id == 0) {
		jsonObj["title"] = this._title;
		}
		if(( descriptionHasBeenChanged() && !jsonObj.containsKey('description')) && !objects.containsKey(this._description) || this.dywa_id == 0) {
		jsonObj["description"] = this._description;
		}
		if(( userCanDiscussHasBeenChanged() && !jsonObj.containsKey('userCanDiscuss')) && !objects.containsKey(this._userCanDiscuss) || this.dywa_id == 0) {
		jsonObj["userCanDiscuss"] = this._userCanDiscuss;
		}
		return jsonObj;
	}
		
	static Submission fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.OfferImpl') {
			return new Offer(cache:cache,jsog:jsog);
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.BiddingImpl') {
			return new Bidding(cache:cache,jsog:jsog);
		}
		throw new core.Exception("Submission is abstract and cannot be initiated by ${jsog['dywaRuntimeType']}");
	}
	
	void set report (Report value)
	{
		this._reportHasBeenSet = true;
		this._report = value;
	}
	
	Report get report
	{
		return this._report;
	}
	
		Report initOnDemandreport()
		{
			if(this._report == null) {
			this.report = new Report();
			}
			return this.report;
		}
		
		void setValuereport(Report value)
		{
			this.report = value;
		}
		
		void reportsetValue(Report value)
		{
			this.report = value;
		}
		
	
	void set decision (Decision value)
	{
		this._decisionHasBeenSet = true;
		this._decision = value;
	}
	
	Decision get decision
	{
		return this._decision;
	}
	
		Decision initOnDemanddecision()
		{
			if(this._decision == null) {
			this.decision = new Decision();
			}
			return this.decision;
		}
		
		void setValuedecision(Decision value)
		{
			this.decision = value;
		}
		
		void decisionsetValue(Decision value)
		{
			this.decision = value;
		}
		
	
	void set issues (DIMEList<Issue> value)
	{
		this._issuesHasBeenSet = true;
		this._issues = value;
	}
	
	DIMEList<Issue> get issues
	{
		return this._issues;
	}
	
		DIMEList<Issue> initOnDemandissues()
		{
			if(this._issues == null) {
			this._issues = new DIMEList();
			}
			return this.issues;
		}
		
		void setValueissues(DIMEList<Issue> value)
		{
			this.issues = value;
		}
		
		void issuessetValue(DIMEList<Issue> value)
		{
			this.issues = value;
		}
		
		void issuesadd(Issue value)
		{
			this.issues.add(value);
			this._issuesHasBeenSet = true;
		}

	
	void set title (core.String value)
	{
		this._titleHasBeenSet = true;
		this._title = value;
	}
	
	core.String get title
	{
		return this._title;
	}
	
		core.String initOnDemandtitle()
		{
			return this.title;
		}
		
		void setValuetitle(core.String value)
		{
			this.title = value;
		}
		
		void titlesetValue(core.String value)
		{
			this.title = value;
		}
		
	
	void set description (core.String value)
	{
		this._descriptionHasBeenSet = true;
		this._description = value;
	}
	
	core.String get description
	{
		return this._description;
	}
	
		core.String initOnDemanddescription()
		{
			return this.description;
		}
		
		void setValuedescription(core.String value)
		{
			this.description = value;
		}
		
		void descriptionsetValue(core.String value)
		{
			this.description = value;
		}
		
	
	void set userCanDiscuss (core.bool value)
	{
		this._userCanDiscussHasBeenSet = true;
		this._userCanDiscuss = value;
	}
	
	core.bool get userCanDiscuss
	{
		return this._userCanDiscuss;
	}
	
		core.bool initOnDemanduserCanDiscuss()
		{
			return this.userCanDiscuss;
		}
		
		void setValueuserCanDiscuss(core.bool value)
		{
			this.userCanDiscuss = value;
		}
		
		void userCanDiscusssetValue(core.bool value)
		{
			this.userCanDiscuss = value;
		}
		
	
}

class Feature extends BaseModel
{
	core.bool _isTemplateForBiddingHasBeenSet = false;
	core.bool isTemplateForBiddingHasBeenChanged() => _isTemplateForBiddingHasBeenSet;
	core.bool _isTemplateForBidding;
	core.bool _isTemplateForOfferHasBeenSet = false;
	core.bool isTemplateForOfferHasBeenChanged() => _isTemplateForOfferHasBeenSet;
	core.bool _isTemplateForOffer;
	core.bool _priorityHasBeenSet = false;
	core.bool priorityHasBeenChanged() => _priorityHasBeenSet||(_priority==null?false:_priority.hasChanged()) ;
	Priority _priority;
	core.bool _titleHasBeenSet = false;
	core.bool titleHasBeenChanged() => _titleHasBeenSet;
	core.String _title;
	
	static Feature fromId(core.int id) {
		var m = new Feature();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'isTemplateForBidding': this.isTemplateForBidding, 
	  'isTemplateForOffer': this.isTemplateForOffer, 
	  'priority': this.priority, 
	  'title': this.title
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'isTemplateForBidding': this.isTemplateForBidding = value; return;
	  case 'isTemplateForOffer': this.isTemplateForOffer = value; return;
	  case 'priority': this.priority = value; return;
	  case 'title': this.title = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Feature({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._isTemplateForBidding = false;
			this._isTemplateForOffer = false;
			this._title = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("isTemplateForBidding")) {
				core.bool jsogObj = jsog["isTemplateForBidding"];
				if(jsogObj != null) {
					core.bool valuear5kYIVLOEe2djpkPxa2Z3Q;
					
					if(jsogObj!=null){
					valuear5kYIVLOEe2djpkPxa2Z3Q = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._isTemplateForBidding = valuear5kYIVLOEe2djpkPxa2Z3Q;
				}
				else {
					this._isTemplateForBidding = false;
				}
			}
			
			
			else{
				this._isTemplateForBidding = false;
			}
			_isTemplateForBiddingHasBeenSet = false;
			if (jsog.containsKey("isTemplateForOffer")) {
				core.bool jsogObj = jsog["isTemplateForOffer"];
				if(jsogObj != null) {
					core.bool valueaczYfMVHpEe2J0bu3ffrh5w;
					
					if(jsogObj!=null){
					valueaczYfMVHpEe2J0bu3ffrh5w = jsogObj.toString().toLowerCase()=='true'?true:false;
					}
					this._isTemplateForOffer = valueaczYfMVHpEe2J0bu3ffrh5w;
				}
				else {
					this._isTemplateForOffer = false;
				}
			}
			
			
			else{
				this._isTemplateForOffer = false;
			}
			_isTemplateForOfferHasBeenSet = false;
			if (jsog.containsKey("priority")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["priority"];
				if(jsogObj != null) {
					Priority valueapse4kVHpEe2J0bu3ffrh5w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueapse4kVHpEe2J0bu3ffrh5w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.Priority") {
								valueapse4kVHpEe2J0bu3ffrh5w = new Priority(cache: cache, jsog: jsogObj);
							}
							else {
								valueapse4kVHpEe2J0bu3ffrh5w = new Priority(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueapse4kVHpEe2J0bu3ffrh5w = new Priority(cache: cache,jsog: jsogObj);
						}
					}
					this._priority = valueapse4kVHpEe2J0bu3ffrh5w;
				}
			}
			
			
			_priorityHasBeenSet = false;
			if (jsog.containsKey("title")) {
				core.String jsogObj = jsog["title"];
				if(jsogObj != null) {
					core.String valueaJgCw0VHqEe2J0bu3ffrh5w;
					
					if(jsogObj!=null){
					valueaJgCw0VHqEe2J0bu3ffrh5w = jsogObj.toString();
					}
					this._title = valueaJgCw0VHqEe2J0bu3ffrh5w;
				}
				else {
					this._title = null;
				}
			}
			
			
			else{
				this._title = null;
			}
			_titleHasBeenSet = false;
		}
	}
	
	void isTemplateForBiddingHasBeenSetted() { _isTemplateForBiddingHasBeenSet=true; }
	void isTemplateForOfferHasBeenSetted() { _isTemplateForOfferHasBeenSet=true; }
	void priorityHasBeenSetted() { _priorityHasBeenSet=true; }
	void titleHasBeenSetted() { _titleHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_isTemplateForBiddingHasBeenSet || 
					_isTemplateForOfferHasBeenSet || 
					_priorityHasBeenSet || 
					_titleHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( priorityHasBeenChanged() && !jsonObj.containsKey('priority')) && !objects.containsKey(this._priority)) {
			if(this._priority != null) {
				jsonObj["priority"] = this._priority.toJSOG(objects);
			}
			else {
				jsonObj["priority"] = null;
			}
			}
			if(( isTemplateForOfferHasBeenChanged() && !jsonObj.containsKey('isTemplateForOffer')) && !objects.containsKey(this._isTemplateForOffer)) {
			jsonObj["isTemplateForOffer"] = this._isTemplateForOffer;
			}
			if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title)) {
			jsonObj["title"] = this._title;
			}
			if(( isTemplateForBiddingHasBeenChanged() && !jsonObj.containsKey('isTemplateForBidding')) && !objects.containsKey(this._isTemplateForBidding)) {
			jsonObj["isTemplateForBidding"] = this._isTemplateForBidding;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.FeatureImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( priorityHasBeenChanged() && !jsonObj.containsKey('priority')) && !objects.containsKey(this._priority) || this.dywa_id == 0) {
		if(this._priority != null) {
			jsonObj["priority"] = this._priority.toJSOG(objects);
		}
		else {
			jsonObj["priority"] = null;
		}
		}
		if(( isTemplateForOfferHasBeenChanged() && !jsonObj.containsKey('isTemplateForOffer')) && !objects.containsKey(this._isTemplateForOffer) || this.dywa_id == 0) {
		jsonObj["isTemplateForOffer"] = this._isTemplateForOffer;
		}
		if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title) || this.dywa_id == 0) {
		jsonObj["title"] = this._title;
		}
		if(( isTemplateForBiddingHasBeenChanged() && !jsonObj.containsKey('isTemplateForBidding')) && !objects.containsKey(this._isTemplateForBidding) || this.dywa_id == 0) {
		jsonObj["isTemplateForBidding"] = this._isTemplateForBidding;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Feature fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.FeatureImpl') {
			return new Feature(cache:cache,jsog:jsog);
		}
		return new Feature(cache:cache,jsog:jsog);
	}
	
	void set priority (Priority value)
	{
		this._priorityHasBeenSet = true;
		this._priority = value;
	}
	
	Priority get priority
	{
		return this._priority;
	}
	
		Priority initOnDemandpriority()
		{
			if(this._priority == null) {
			this.priority = new Priority();
			}
			return this.priority;
		}
		
		void setValuepriority(Priority value)
		{
			this.priority = value;
		}
		
		void prioritysetValue(Priority value)
		{
			this.priority = value;
		}
		
	
	void set isTemplateForOffer (core.bool value)
	{
		this._isTemplateForOfferHasBeenSet = true;
		this._isTemplateForOffer = value;
	}
	
	core.bool get isTemplateForOffer
	{
		return this._isTemplateForOffer;
	}
	
		core.bool initOnDemandisTemplateForOffer()
		{
			return this.isTemplateForOffer;
		}
		
		void setValueisTemplateForOffer(core.bool value)
		{
			this.isTemplateForOffer = value;
		}
		
		void isTemplateForOffersetValue(core.bool value)
		{
			this.isTemplateForOffer = value;
		}
		
	
	void set title (core.String value)
	{
		this._titleHasBeenSet = true;
		this._title = value;
	}
	
	core.String get title
	{
		return this._title;
	}
	
		core.String initOnDemandtitle()
		{
			return this.title;
		}
		
		void setValuetitle(core.String value)
		{
			this.title = value;
		}
		
		void titlesetValue(core.String value)
		{
			this.title = value;
		}
		
	
	void set isTemplateForBidding (core.bool value)
	{
		this._isTemplateForBiddingHasBeenSet = true;
		this._isTemplateForBidding = value;
	}
	
	core.bool get isTemplateForBidding
	{
		return this._isTemplateForBidding;
	}
	
		core.bool initOnDemandisTemplateForBidding()
		{
			return this.isTemplateForBidding;
		}
		
		void setValueisTemplateForBidding(core.bool value)
		{
			this.isTemplateForBidding = value;
		}
		
		void isTemplateForBiddingsetValue(core.bool value)
		{
			this.isTemplateForBidding = value;
		}
		
	
}

class Priority extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static Priority fromId(core.int id) {
		var m = new Priority();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Priority({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaMs_zwXmkEe2ix_xiis0jnw;
					
					if(jsogObj!=null){
					valueaMs_zwXmkEe2ix_xiis0jnw = jsogObj.toString();
					}
					this._dywaDisplayName = valueaMs_zwXmkEe2ix_xiis0jnw;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'high':
				return "high";
			case 'medium':
				return "medium";
			case 'low':
				return "low";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.Priority";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Priority fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.Priority') {
			return new Priority(cache:cache,jsog:jsog);
		}
		return new Priority(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}

class Issue extends BaseModel
{
	core.bool _commentsHasBeenSet = false;
	core.bool commentsHasBeenChanged() => _commentsHasBeenSet;
	DIMEList<Comment> _comments;
	core.bool _stateHasBeenSet = false;
	core.bool stateHasBeenChanged() => _stateHasBeenSet||(_state==null?false:_state.hasChanged()) ;
	IssueState _state;
	core.bool _titleHasBeenSet = false;
	core.bool titleHasBeenChanged() => _titleHasBeenSet;
	core.String _title;
	
	static Issue fromId(core.int id) {
		var m = new Issue();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'comments': this.comments, 
	  'state': this.state, 
	  'title': this.title
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'comments': this.comments = value; return;
	  case 'state': this.state = value; return;
	  case 'title': this.title = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Issue({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._comments = new DIMEList.monitored(commentsHasBeenSetted);
			this._title = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			this._comments = new DIMEList.monitored(commentsHasBeenSetted);
			if (jsog.containsKey("comments")) {
				for (core.Map<core.String,core.dynamic> iter in jsog["comments"]) {
					core.Map<core.String,core.dynamic> jsogObj = iter;
					Comment valueayDwO8VN9Ee2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueayDwO8VN9Ee2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.CommentImpl") {
								valueayDwO8VN9Ee2KQc5QIsW97w = new Comment(cache: cache, jsog: jsogObj);
							}
							else {
								valueayDwO8VN9Ee2KQc5QIsW97w = new Comment(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueayDwO8VN9Ee2KQc5QIsW97w = new Comment(cache: cache,jsog: jsogObj);
						}
					}
					this._comments.add(valueayDwO8VN9Ee2KQc5QIsW97w);
				}
			}
			
			
			_commentsHasBeenSet = false;
			if (jsog.containsKey("state")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["state"];
				if(jsogObj != null) {
					IssueState valueaSNjc8VN_45_Ee2KQc5QIsW97w;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueaSNjc8VN_45_Ee2KQc5QIsW97w = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.IssueState") {
								valueaSNjc8VN_45_Ee2KQc5QIsW97w = new IssueState(cache: cache, jsog: jsogObj);
							}
							else {
								valueaSNjc8VN_45_Ee2KQc5QIsW97w = new IssueState(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueaSNjc8VN_45_Ee2KQc5QIsW97w = new IssueState(cache: cache,jsog: jsogObj);
						}
					}
					this._state = valueaSNjc8VN_45_Ee2KQc5QIsW97w;
				}
			}
			
			
			_stateHasBeenSet = false;
			if (jsog.containsKey("title")) {
				core.String jsogObj = jsog["title"];
				if(jsogObj != null) {
					core.String valuearYOyIVN9Ee2KQc5QIsW97w;
					
					if(jsogObj!=null){
					valuearYOyIVN9Ee2KQc5QIsW97w = jsogObj.toString();
					}
					this._title = valuearYOyIVN9Ee2KQc5QIsW97w;
				}
				else {
					this._title = null;
				}
			}
			
			
			else{
				this._title = null;
			}
			_titleHasBeenSet = false;
		}
	}
	
	void commentsHasBeenSetted() { _commentsHasBeenSet=true; }
	void stateHasBeenSetted() { _stateHasBeenSet=true; }
	void titleHasBeenSetted() { _titleHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_commentsHasBeenSet || 
					_stateHasBeenSet || 
					_titleHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( commentsHasBeenChanged() && !jsonObj.containsKey('comments'))) {
			if(this._comments.isEmpty){
				jsonObj["comments"] = [];
			}
			else{
				jsonObj["comments"] = this._comments.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
			}
			}
			if(( stateHasBeenChanged() && !jsonObj.containsKey('state')) && !objects.containsKey(this._state)) {
			if(this._state != null) {
				jsonObj["state"] = this._state.toJSOG(objects);
			}
			else {
				jsonObj["state"] = null;
			}
			}
			if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title)) {
			jsonObj["title"] = this._title;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.IssueImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( commentsHasBeenChanged() && !jsonObj.containsKey('comments')) || this.dywa_id == 0) {
		if(this._comments.isEmpty){
			jsonObj["comments"] = [];
		}
		else{
			jsonObj["comments"] = this._comments.where((n) => objects.containsKey(n)).map((n)=>n.toJSOG(objects)).toList();
		}
		}
		if(( stateHasBeenChanged() && !jsonObj.containsKey('state')) && !objects.containsKey(this._state) || this.dywa_id == 0) {
		if(this._state != null) {
			jsonObj["state"] = this._state.toJSOG(objects);
		}
		else {
			jsonObj["state"] = null;
		}
		}
		if(( titleHasBeenChanged() && !jsonObj.containsKey('title')) && !objects.containsKey(this._title) || this.dywa_id == 0) {
		jsonObj["title"] = this._title;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Issue fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.IssueImpl') {
			return new Issue(cache:cache,jsog:jsog);
		}
		return new Issue(cache:cache,jsog:jsog);
	}
	
	void set comments (DIMEList<Comment> value)
	{
		this._commentsHasBeenSet = true;
		this._comments = value;
	}
	
	DIMEList<Comment> get comments
	{
		return this._comments;
	}
	
		DIMEList<Comment> initOnDemandcomments()
		{
			if(this._comments == null) {
			this._comments = new DIMEList();
			}
			return this.comments;
		}
		
		void setValuecomments(DIMEList<Comment> value)
		{
			this.comments = value;
		}
		
		void commentssetValue(DIMEList<Comment> value)
		{
			this.comments = value;
		}
		
		void commentsadd(Comment value)
		{
			this.comments.add(value);
			this._commentsHasBeenSet = true;
		}

	
	void set state (IssueState value)
	{
		this._stateHasBeenSet = true;
		this._state = value;
	}
	
	IssueState get state
	{
		return this._state;
	}
	
		IssueState initOnDemandstate()
		{
			if(this._state == null) {
			this.state = new IssueState();
			}
			return this.state;
		}
		
		void setValuestate(IssueState value)
		{
			this.state = value;
		}
		
		void statesetValue(IssueState value)
		{
			this.state = value;
		}
		
	
	void set title (core.String value)
	{
		this._titleHasBeenSet = true;
		this._title = value;
	}
	
	core.String get title
	{
		return this._title;
	}
	
		core.String initOnDemandtitle()
		{
			return this.title;
		}
		
		void setValuetitle(core.String value)
		{
			this.title = value;
		}
		
		void titlesetValue(core.String value)
		{
			this.title = value;
		}
		
	
}

class Comment extends BaseModel
{
	core.bool _commentFirstNameHasBeenSet = false;
	core.bool commentFirstNameHasBeenChanged() => _commentFirstNameHasBeenSet;
	core.String _commentFirstName;
	core.bool _commentLastNameHasBeenSet = false;
	core.bool commentLastNameHasBeenChanged() => _commentLastNameHasBeenSet;
	core.String _commentLastName;
	core.bool _textHasBeenSet = false;
	core.bool textHasBeenChanged() => _textHasBeenSet;
	core.String _text;
	
	static Comment fromId(core.int id) {
		var m = new Comment();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'commentFirstName': this.commentFirstName, 
	  'commentLastName': this.commentLastName, 
	  'text': this.text
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'commentFirstName': this.commentFirstName = value; return;
	  case 'commentLastName': this.commentLastName = value; return;
	  case 'text': this.text = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Comment({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._commentFirstName = null;
			this._commentLastName = null;
			this._text = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("commentFirstName")) {
				core.String jsogObj = jsog["commentFirstName"];
				if(jsogObj != null) {
					core.String valueaQDYzsXmXEe2yL_RKKzoxiA;
					
					if(jsogObj!=null){
					valueaQDYzsXmXEe2yL_RKKzoxiA = jsogObj.toString();
					}
					this._commentFirstName = valueaQDYzsXmXEe2yL_RKKzoxiA;
				}
				else {
					this._commentFirstName = null;
				}
			}
			
			
			else{
				this._commentFirstName = null;
			}
			_commentFirstNameHasBeenSet = false;
			if (jsog.containsKey("commentLastName")) {
				core.String jsogObj = jsog["commentLastName"];
				if(jsogObj != null) {
					core.String valueaSEAnoXmXEe2yL_RKKzoxiA;
					
					if(jsogObj!=null){
					valueaSEAnoXmXEe2yL_RKKzoxiA = jsogObj.toString();
					}
					this._commentLastName = valueaSEAnoXmXEe2yL_RKKzoxiA;
				}
				else {
					this._commentLastName = null;
				}
			}
			
			
			else{
				this._commentLastName = null;
			}
			_commentLastNameHasBeenSet = false;
			if (jsog.containsKey("text")) {
				core.String jsogObj = jsog["text"];
				if(jsogObj != null) {
					core.String valueavzWSkVN9Ee2KQc5QIsW97w;
					
					if(jsogObj!=null){
					valueavzWSkVN9Ee2KQc5QIsW97w = jsogObj.toString();
					}
					this._text = valueavzWSkVN9Ee2KQc5QIsW97w;
				}
				else {
					this._text = null;
				}
			}
			
			
			else{
				this._text = null;
			}
			_textHasBeenSet = false;
		}
	}
	
	void commentFirstNameHasBeenSetted() { _commentFirstNameHasBeenSet=true; }
	void commentLastNameHasBeenSetted() { _commentLastNameHasBeenSet=true; }
	void textHasBeenSetted() { _textHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_commentFirstNameHasBeenSet || 
					_commentLastNameHasBeenSet || 
					_textHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( textHasBeenChanged() && !jsonObj.containsKey('text')) && !objects.containsKey(this._text)) {
			jsonObj["text"] = this._text;
			}
			if(( commentFirstNameHasBeenChanged() && !jsonObj.containsKey('commentFirstName')) && !objects.containsKey(this._commentFirstName)) {
			jsonObj["commentFirstName"] = this._commentFirstName;
			}
			if(( commentLastNameHasBeenChanged() && !jsonObj.containsKey('commentLastName')) && !objects.containsKey(this._commentLastName)) {
			jsonObj["commentLastName"] = this._commentLastName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.CommentImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( textHasBeenChanged() && !jsonObj.containsKey('text')) && !objects.containsKey(this._text) || this.dywa_id == 0) {
		jsonObj["text"] = this._text;
		}
		if(( commentFirstNameHasBeenChanged() && !jsonObj.containsKey('commentFirstName')) && !objects.containsKey(this._commentFirstName) || this.dywa_id == 0) {
		jsonObj["commentFirstName"] = this._commentFirstName;
		}
		if(( commentLastNameHasBeenChanged() && !jsonObj.containsKey('commentLastName')) && !objects.containsKey(this._commentLastName) || this.dywa_id == 0) {
		jsonObj["commentLastName"] = this._commentLastName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Comment fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.CommentImpl') {
			return new Comment(cache:cache,jsog:jsog);
		}
		return new Comment(cache:cache,jsog:jsog);
	}
	
	void set text (core.String value)
	{
		this._textHasBeenSet = true;
		this._text = value;
	}
	
	core.String get text
	{
		return this._text;
	}
	
		core.String initOnDemandtext()
		{
			return this.text;
		}
		
		void setValuetext(core.String value)
		{
			this.text = value;
		}
		
		void textsetValue(core.String value)
		{
			this.text = value;
		}
		
	
	void set commentFirstName (core.String value)
	{
		this._commentFirstNameHasBeenSet = true;
		this._commentFirstName = value;
	}
	
	core.String get commentFirstName
	{
		return this._commentFirstName;
	}
	
		core.String initOnDemandcommentFirstName()
		{
			return this.commentFirstName;
		}
		
		void setValuecommentFirstName(core.String value)
		{
			this.commentFirstName = value;
		}
		
		void commentFirstNamesetValue(core.String value)
		{
			this.commentFirstName = value;
		}
		
	
	void set commentLastName (core.String value)
	{
		this._commentLastNameHasBeenSet = true;
		this._commentLastName = value;
	}
	
	core.String get commentLastName
	{
		return this._commentLastName;
	}
	
		core.String initOnDemandcommentLastName()
		{
			return this.commentLastName;
		}
		
		void setValuecommentLastName(core.String value)
		{
			this.commentLastName = value;
		}
		
		void commentLastNamesetValue(core.String value)
		{
			this.commentLastName = value;
		}
		
	
}

class IssueState extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static IssueState fromId(core.int id) {
		var m = new IssueState();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	IssueState({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaMtI9sXmkEe2ix_xiis0jnw;
					
					if(jsogObj!=null){
					valueaMtI9sXmkEe2ix_xiis0jnw = jsogObj.toString();
					}
					this._dywaDisplayName = valueaMtI9sXmkEe2ix_xiis0jnw;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'resolved':
				return "resolved";
			case 'unresolved':
				return "unresolved";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.IssueState";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static IssueState fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.IssueState') {
			return new IssueState(cache:cache,jsog:jsog);
		}
		return new IssueState(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}

class Assignment extends BaseModel
{
	core.bool _biddingHasBeenSet = false;
	core.bool biddingHasBeenChanged() => _biddingHasBeenSet||(_bidding==null?false:_bidding.hasChanged()) ;
	Bidding _bidding;
	core.bool _offerHasBeenSet = false;
	core.bool offerHasBeenChanged() => _offerHasBeenSet||(_offer==null?false:_offer.hasChanged()) ;
	Offer _offer;
	
	static Assignment fromId(core.int id) {
		var m = new Assignment();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'bidding': this.bidding, 
	  'offer': this.offer
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'bidding': this.bidding = value; return;
	  case 'offer': this.offer = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Assignment({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("bidding")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["bidding"];
				if(jsogObj != null) {
					Bidding valueat4NM0VrWEe2zsZyFB7dFOg;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueat4NM0VrWEe2zsZyFB7dFOg = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.BiddingImpl") {
								valueat4NM0VrWEe2zsZyFB7dFOg = new Bidding(cache: cache, jsog: jsogObj);
							}
							else {
								valueat4NM0VrWEe2zsZyFB7dFOg = new Bidding(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueat4NM0VrWEe2zsZyFB7dFOg = new Bidding(cache: cache,jsog: jsogObj);
						}
					}
					this._bidding = valueat4NM0VrWEe2zsZyFB7dFOg;
				}
			}
			
			
			_biddingHasBeenSet = false;
			if (jsog.containsKey("offer")) {
				core.Map<core.String,core.dynamic> jsogObj = jsog["offer"];
				if(jsogObj != null) {
					Offer valueareoGUVrWEe2zsZyFB7dFOg;
					
					core.String jsogId;
					
					if (jsogObj.containsKey('@ref')) {
						jsogId = jsogObj['@ref'];
					}
					else {
					 	jsogId = jsogObj['@id'];
					}
					if (cache.containsKey(jsogId)) {
						valueareoGUVrWEe2zsZyFB7dFOg = cache[jsogId];
					}
					else {
						if (jsogObj != null) {
							if (jsogObj['dywaRuntimeType'] == "de.ls5.dywa.generated.rest.types.OfferImpl") {
								valueareoGUVrWEe2zsZyFB7dFOg = new Offer(cache: cache, jsog: jsogObj);
							}
							else {
								valueareoGUVrWEe2zsZyFB7dFOg = new Offer(cache: cache,jsog: jsogObj);
							}
						}
						else {
							valueareoGUVrWEe2zsZyFB7dFOg = new Offer(cache: cache,jsog: jsogObj);
						}
					}
					this._offer = valueareoGUVrWEe2zsZyFB7dFOg;
				}
			}
			
			
			_offerHasBeenSet = false;
		}
	}
	
	void biddingHasBeenSetted() { _biddingHasBeenSet=true; }
	void offerHasBeenSetted() { _offerHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_biddingHasBeenSet || 
					_offerHasBeenSet
			;
	}
	
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( offerHasBeenChanged() && !jsonObj.containsKey('offer')) && !objects.containsKey(this._offer)) {
			if(this._offer != null) {
				jsonObj["offer"] = this._offer.toJSOG(objects);
			}
			else {
				jsonObj["offer"] = null;
			}
			}
			if(( biddingHasBeenChanged() && !jsonObj.containsKey('bidding')) && !objects.containsKey(this._bidding)) {
			if(this._bidding != null) {
				jsonObj["bidding"] = this._bidding.toJSOG(objects);
			}
			else {
				jsonObj["bidding"] = null;
			}
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.AssignmentImpl";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( offerHasBeenChanged() && !jsonObj.containsKey('offer')) && !objects.containsKey(this._offer) || this.dywa_id == 0) {
		if(this._offer != null) {
			jsonObj["offer"] = this._offer.toJSOG(objects);
		}
		else {
			jsonObj["offer"] = null;
		}
		}
		if(( biddingHasBeenChanged() && !jsonObj.containsKey('bidding')) && !objects.containsKey(this._bidding) || this.dywa_id == 0) {
		if(this._bidding != null) {
			jsonObj["bidding"] = this._bidding.toJSOG(objects);
		}
		else {
			jsonObj["bidding"] = null;
		}
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Assignment fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.AssignmentImpl') {
			return new Assignment(cache:cache,jsog:jsog);
		}
		return new Assignment(cache:cache,jsog:jsog);
	}
	
	void set offer (Offer value)
	{
		this._offerHasBeenSet = true;
		this._offer = value;
	}
	
	Offer get offer
	{
		return this._offer;
	}
	
		Offer initOnDemandoffer()
		{
			if(this._offer == null) {
			this.offer = new Offer();
			}
			return this.offer;
		}
		
		void setValueoffer(Offer value)
		{
			this.offer = value;
		}
		
		void offersetValue(Offer value)
		{
			this.offer = value;
		}
		
	
	void set bidding (Bidding value)
	{
		this._biddingHasBeenSet = true;
		this._bidding = value;
	}
	
	Bidding get bidding
	{
		return this._bidding;
	}
	
		Bidding initOnDemandbidding()
		{
			if(this._bidding == null) {
			this.bidding = new Bidding();
			}
			return this.bidding;
		}
		
		void setValuebidding(Bidding value)
		{
			this.bidding = value;
		}
		
		void biddingsetValue(Bidding value)
		{
			this.bidding = value;
		}
		
	
}

class Status extends BaseModel
{
	core.bool _dywaDisplayNameHasBeenSet = false;
	core.bool dywaDisplayNameHasBeenChanged() => _dywaDisplayNameHasBeenSet;
	core.String _dywaDisplayName;
	
	static Status fromId(core.int id) {
		var m = new Status();
		m.dywa_id = id;
		return m;
	}
	
	
	// reflection methods to read and wirte dart properties by string name
	
	core.dynamic $$getProperty(core.String prop) {
	  var propMap = {
	  'dywaDisplayName': this.dywaDisplayName
	  };
	
	  if (!propMap.containsKey(prop)) throw NoSuchPropertyException(prop);
	  return propMap[prop];
	}
	
	void $$setProperty(core.String prop, core.dynamic value) {
	  switch (prop) {
	  case 'dywaDisplayName': this.dywaDisplayName = value; return;
	    default: throw NoSuchPropertyException(prop);
	  }
	}
	
	core.bool $$hasProperty(core.String prop) {
	  try {
	    $$getProperty(prop);
	    return true;
	  } on NoSuchPropertyException catch (e) {
	    return false;
	  }
	}
	
	Status({core.Map<core.String,core.dynamic> cache, jsog}) {
		if (cache == null) {
			cache = new core.Map();
		}

		// default constructor
		if (jsog == null) {
			
			this.dywa_id = -1;
			this.dywa_version = 0;
			this.dywa_name = null;
			
			// properties
			this._dywaDisplayName = null;
		}
		// from jsog
		else {
			core.String jsogId = jsog['@id'];
			cache[jsogId] = this;
			
			this.dywa_id = jsog['dywaId'];
			this.dywa_version = jsog['dywaVersion'];
			this.dywa_name = jsog['dywaName'];
			
			// properties
			if (jsog.containsKey("dywaDisplayName")) {
				core.String jsogObj = jsog["dywaDisplayName"];
				if(jsogObj != null) {
					core.String valueaMtPrYXmkEe2ix_xiis0jnw;
					
					if(jsogObj!=null){
					valueaMtPrYXmkEe2ix_xiis0jnw = jsogObj.toString();
					}
					this._dywaDisplayName = valueaMtPrYXmkEe2ix_xiis0jnw;
				}
				else {
					this._dywaDisplayName = null;
				}
			}
			
			
			else{
				this._dywaDisplayName = null;
			}
			_dywaDisplayNameHasBeenSet = false;
		}
	}
	
	void dywaDisplayNameHasBeenSetted() { _dywaDisplayNameHasBeenSet=true; }
	
	core.bool hasChanged() {
		return 		_dywaDisplayNameHasBeenSet
			;
	}
	
	core.String toString() {
		switch(this.dywa_name) {
			case 'open':
				return "open";
			case 'closed':
				return "closed";
		}
	    	return this.dywa_name;
	  	}
	
	core.Map<core.String,core.dynamic> toJSOG(core.Map<core.Object,core.dynamic> objects) {
		if (objects == null) {
			objects = new core.Map();
		}
		core.int jsogId;
		core.Map<core.String,core.dynamic> jsonObj = new core.Map();
		if(objects.containsKey(this)) {
			jsogId = objects[this]['id'];
			jsonObj = objects[this]['value'];
			if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName)) {
			jsonObj["dywaDisplayName"] = this._dywaDisplayName;
			}
			return { 
				'@ref': jsogId.toString()
			};
		}
		else {
			jsogId = objects.length;
			var pair = {
				'id': jsogId,
				'value': jsonObj
			};
			objects[this] = pair;
		}
		jsonObj['@id'] = jsogId.toString();
		jsonObj['dywaRuntimeType'] = "de.ls5.dywa.generated.rest.types.Status";

		jsonObj['dywaId'] = this.dywa_id;
		jsonObj['dywaVersion'] = this.dywa_version;
		if(this.dywa_name != null) {
			jsonObj['dywaName'] = this.dywa_name;
		}
		if(( dywaDisplayNameHasBeenChanged() && !jsonObj.containsKey('dywaDisplayName')) && !objects.containsKey(this._dywaDisplayName) || this.dywa_id == 0) {
		jsonObj["dywaDisplayName"] = this._dywaDisplayName;
		}
		return jsonObj;
	}
	static fromJSON(core.String json) {
		return fromJSOG(cache:new core.Map<core.String,core.dynamic>(),jsog:jsonDecode(json));
	}
		
	static Status fromJSOG({core.Map<core.String,core.dynamic> cache, jsog}) {
		if(jsog.containsKey('@ref')) {
			assert (cache.containsKey(jsog['@ref']));
			return cache[jsog['@ref']];
		}
		if(jsog['dywaRuntimeType'] == 'de.ls5.dywa.generated.rest.types.Status') {
			return new Status(cache:cache,jsog:jsog);
		}
		return new Status(cache:cache,jsog:jsog);
	}
	
	void set dywaDisplayName (core.String value)
	{
		this._dywaDisplayNameHasBeenSet = true;
		this._dywaDisplayName = value;
	}
	
	core.String get dywaDisplayName
	{
		return this._dywaDisplayName;
	}
	
		core.String initOnDemanddywaDisplayName()
		{
			return this.dywaDisplayName;
		}
		
		void setValuedywaDisplayName(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
		void dywaDisplayNamesetValue(core.String value)
		{
			this.dywaDisplayName = value;
		}
		
	
}
