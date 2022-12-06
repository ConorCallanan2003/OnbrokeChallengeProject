package de.ls5.dywa.generated.util;

public class TypeInfo {
	private static java.util.Map<Long, java.lang.Class<?>> idToClassMap = new java.util.HashMap<>();
	private static java.util.Map<Long, java.util.Map<Long, String>> typeFieldNamesMap = new java.util.HashMap<>();
	private static java.util.Map<Long, String> typeNamesMap = new java.util.HashMap<>();
	private static java.util.Set<Long> enumTypes = new java.util.HashSet<>();
	private static java.util.Set<Long> allTypes = new java.util.HashSet<>();
	
	static {
		/* DBType _psj6gvn9ee2kqc5 */
		typeNamesMap.put(11L, "Issue");
		idToClassMap.put(11L, de.ls5.dywa.generated.entity.onbroke.models.app.IssueImpl.class);
		allTypes.add(11L);
		java.util.Map<Long, String> map11 = new java.util.HashMap<Long, String>();
		map11.put(56L, "title");
		map11.put(57L, "comments");
		map11.put(58L, "state");
		typeFieldNamesMap.put(11L, map11);
		/* DBType _uabiivn9ee2kqc5 */
		typeNamesMap.put(12L, "Comment");
		idToClassMap.put(12L, de.ls5.dywa.generated.entity.onbroke.models.app.CommentImpl.class);
		allTypes.add(12L);
		java.util.Map<Long, String> map12 = new java.util.HashMap<Long, String>();
		map12.put(59L, "text");
		typeFieldNamesMap.put(12L, map12);
		/* DBType _mzz8svn_ee2kqc5 */
		typeNamesMap.put(13L, "IssueState");
		idToClassMap.put(13L, de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity.class);
		enumTypes.add(13L);
		allTypes.add(13L);
		java.util.Map<Long, String> map13 = new java.util.HashMap<Long, String>();
		map13.put(60L, "resolved");
		map13.put(61L, "unresolved");
		map13.put(62L, "dywaDisplayName");
		typeFieldNamesMap.put(13L, map13);
		/* DBType _teqgmvrwee2zszy */
		typeNamesMap.put(14L, "Assignment");
		idToClassMap.put(14L, de.ls5.dywa.generated.entity.onbroke.models.app.AssignmentImpl.class);
		allTypes.add(14L);
		java.util.Map<Long, String> map14 = new java.util.HashMap<Long, String>();
		map14.put(63L, "offer");
		map14.put(64L, "bidding");
		typeFieldNamesMap.put(14L, map14);
		/* DBType _dh6bymwneewzvvv */
		typeNamesMap.put(0L, "User");
		idToClassMap.put(0L, de.ls5.dywa.generated.entity.onbroke.models.app.UserImpl.class);
		allTypes.add(0L);
		java.util.Map<Long, String> map0 = new java.util.HashMap<Long, String>();
		map0.put(15L, "baseUser");
		map0.put(16L, "firstName");
		map0.put(17L, "lastName");
		map0.put(18L, "role");
		map0.put(19L, "offers");
		map0.put(20L, "biddings");
		map0.put(21L, "dywaSwitchedTo");
		typeFieldNamesMap.put(0L, map0);
		/* DBType _udys4mwneewzvvv */
		typeNamesMap.put(1L, "BaseUser");
		idToClassMap.put(1L, de.ls5.dywa.generated.entity.onbroke.models.app.BaseUserImpl.class);
		allTypes.add(1L);
		java.util.Map<Long, String> map1 = new java.util.HashMap<Long, String>();
		map1.put(22L, "user");
		map1.put(23L, "password");
		map1.put(24L, "username");
		typeFieldNamesMap.put(1L, map1);
		/* DBType _mshlyfe3ee2vgca */
		typeNamesMap.put(2L, "UserRole");
		idToClassMap.put(2L, de.ls5.dywa.generated.entity.onbroke.models.app.UserRoleEntity.class);
		enumTypes.add(2L);
		allTypes.add(2L);
		java.util.Map<Long, String> map2 = new java.util.HashMap<Long, String>();
		map2.put(25L, "admin");
		map2.put(26L, "broker");
		map2.put(27L, "user");
		map2.put(28L, "dywaDisplayName");
		typeFieldNamesMap.put(2L, map2);
		/* DBType _dj1lavfnee2j0bu */
		typeNamesMap.put(3L, "Offer");
		idToClassMap.put(3L, de.ls5.dywa.generated.entity.onbroke.models.app.OfferImpl.class);
		allTypes.add(3L);
		java.util.Map<Long, String> map3 = new java.util.HashMap<Long, String>();
		map3.put(29L, "user");
		map3.put(30L, "biddings");
		map3.put(31L, "preferences");
		map3.put(32L, "features");
		map3.put(33L, "assigned");
		typeFieldNamesMap.put(3L, map3);
		/* DBType _fsl_ovfnee2j0bu */
		typeNamesMap.put(4L, "Bidding");
		idToClassMap.put(4L, de.ls5.dywa.generated.entity.onbroke.models.app.BiddingImpl.class);
		allTypes.add(4L);
		java.util.Map<Long, String> map4 = new java.util.HashMap<Long, String>();
		map4.put(34L, "user");
		map4.put(35L, "offer");
		map4.put(36L, "assigned");
		map4.put(37L, "features");
		map4.put(38L, "preferences");
		typeFieldNamesMap.put(4L, map4);
		/* DBType _ec67evfsee2j0bu */
		typeNamesMap.put(5L, "Report");
		idToClassMap.put(5L, de.ls5.dywa.generated.entity.onbroke.models.app.ReportImpl.class);
		allTypes.add(5L);
		java.util.Map<Long, String> map5 = new java.util.HashMap<Long, String>();
		typeFieldNamesMap.put(5L, map5);
		/* DBType _lmr_0vfsee2j0bu */
		typeNamesMap.put(6L, "DecisionState");
		idToClassMap.put(6L, de.ls5.dywa.generated.entity.onbroke.models.app.DecisionStateEntity.class);
		enumTypes.add(6L);
		allTypes.add(6L);
		java.util.Map<Long, String> map6 = new java.util.HashMap<Long, String>();
		map6.put(39L, "approved");
		map6.put(40L, "rejected");
		map6.put(41L, "dywaDisplayName");
		typeFieldNamesMap.put(6L, map6);
		/* DBType _btx2cvgbee2j0bu */
		typeNamesMap.put(7L, "Decision");
		idToClassMap.put(7L, de.ls5.dywa.generated.entity.onbroke.models.app.DecisionImpl.class);
		allTypes.add(7L);
		java.util.Map<Long, String> map7 = new java.util.HashMap<Long, String>();
		map7.put(42L, "state");
		typeFieldNamesMap.put(7L, map7);
		/* DBType _v7ig8fgdee2j0bu */
		typeNamesMap.put(8L, "Submission");
		idToClassMap.put(8L, de.ls5.dywa.generated.entity.onbroke.models.app.SubmissionAbs.class);
		allTypes.add(8L);
		java.util.Map<Long, String> map8 = new java.util.HashMap<Long, String>();
		map8.put(43L, "report");
		map8.put(44L, "decision");
		map8.put(45L, "title");
		map8.put(46L, "issues");
		typeFieldNamesMap.put(8L, map8);
		/* DBType _a6uwqvhpee2j0bu */
		typeNamesMap.put(9L, "Feature");
		idToClassMap.put(9L, de.ls5.dywa.generated.entity.onbroke.models.app.FeatureImpl.class);
		allTypes.add(9L);
		java.util.Map<Long, String> map9 = new java.util.HashMap<Long, String>();
		map9.put(48L, "isTemplateForOffer");
		map9.put(49L, "priority");
		map9.put(50L, "title");
		map9.put(51L, "isTemplateForBidding");
		typeFieldNamesMap.put(9L, map9);
		/* DBType _j0kauvhpee2j0bu */
		typeNamesMap.put(10L, "Priority");
		idToClassMap.put(10L, de.ls5.dywa.generated.entity.onbroke.models.app.PriorityEntity.class);
		enumTypes.add(10L);
		allTypes.add(10L);
		java.util.Map<Long, String> map10 = new java.util.HashMap<Long, String>();
		map10.put(52L, "high");
		map10.put(53L, "medium");
		map10.put(54L, "low");
		map10.put(55L, "dywaDisplayName");
		typeFieldNamesMap.put(10L, map10);
	}
	
	public static String getGeneratedClassName(Long typeId) {
		java.lang.Class<?> clazz =  idToClassMap.get(typeId);
		return clazz != null ? clazz.getName() : null;
	}
	
	public static java.lang.Class<?> getGeneratedClass(Long typeId) {
		return idToClassMap.get(typeId);
	}
	
	public static java.util.Collection<Class<?>> getAllGeneratedClasses() {
		return idToClassMap.values();
	}
	
	public static java.util.List<String> getAllGeneratedClassNames() {
		return idToClassMap.values().stream().map(Class::getName).collect(java.util.stream.Collectors.toList());
	}
	
	public static boolean isEnumerable(Long id) {
		return enumTypes.contains(id);
	}
	
	public static boolean typeInUse(Long typeId) {
		return allTypes.contains(typeId);
	}
	
	public static java.util.Map<Long, String> getTypeFieldNames(Long typeId) {
		return typeFieldNamesMap.get(typeId);
	}
	
	public static String getTypeName(Long id) {
		return typeNamesMap.get(id);
	}
}
