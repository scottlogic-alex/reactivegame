package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlObjectClass implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olApplication(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olNamespace(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFolder(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olRecipient(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olAttachment(5),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olAddressList(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olAddressEntry(8),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  olFolders(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  olItems(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  olRecipients(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  olAttachments(18),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  olAddressLists(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  olAddressEntries(21),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  olAppointment(26),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  olMeetingRequest(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  olMeetingCancellation(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  olMeetingResponseNegative(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  olMeetingResponsePositive(56),
  /**
   * <p>
   * The value of this constant is 57
   * </p>
   */
  olMeetingResponseTentative(57),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  olRecurrencePattern(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  olExceptions(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  olException(30),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  olAction(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  olActions(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  olExplorer(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  olInspector(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  olPages(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  olFormDescription(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  olUserProperties(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  olUserProperty(39),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  olContact(40),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  olDocument(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  olJournal(42),
  /**
   * <p>
   * The value of this constant is 43
   * </p>
   */
  olMail(43),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  olNote(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  olPost(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  olReport(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  olRemote(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  olTask(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  olTaskRequest(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  olTaskRequestUpdate(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  olTaskRequestAccept(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  olTaskRequestDecline(52),
  /**
   * <p>
   * The value of this constant is 60
   * </p>
   */
  olExplorers(60),
  /**
   * <p>
   * The value of this constant is 61
   * </p>
   */
  olInspectors(61),
  /**
   * <p>
   * The value of this constant is 62
   * </p>
   */
  olPanes(62),
  /**
   * <p>
   * The value of this constant is 63
   * </p>
   */
  olOutlookBarPane(63),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  olOutlookBarStorage(64),
  /**
   * <p>
   * The value of this constant is 65
   * </p>
   */
  olOutlookBarGroups(65),
  /**
   * <p>
   * The value of this constant is 66
   * </p>
   */
  olOutlookBarGroup(66),
  /**
   * <p>
   * The value of this constant is 67
   * </p>
   */
  olOutlookBarShortcuts(67),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  olOutlookBarShortcut(68),
  /**
   * <p>
   * The value of this constant is 69
   * </p>
   */
  olDistributionList(69),
  /**
   * <p>
   * The value of this constant is 70
   * </p>
   */
  olPropertyPageSite(70),
  /**
   * <p>
   * The value of this constant is 71
   * </p>
   */
  olPropertyPages(71),
  /**
   * <p>
   * The value of this constant is 72
   * </p>
   */
  olSyncObject(72),
  /**
   * <p>
   * The value of this constant is 73
   * </p>
   */
  olSyncObjects(73),
  /**
   * <p>
   * The value of this constant is 74
   * </p>
   */
  olSelection(74),
  /**
   * <p>
   * The value of this constant is 75
   * </p>
   */
  olLink(75),
  /**
   * <p>
   * The value of this constant is 76
   * </p>
   */
  olLinks(76),
  /**
   * <p>
   * The value of this constant is 77
   * </p>
   */
  olSearch(77),
  /**
   * <p>
   * The value of this constant is 78
   * </p>
   */
  olResults(78),
  /**
   * <p>
   * The value of this constant is 79
   * </p>
   */
  olViews(79),
  /**
   * <p>
   * The value of this constant is 80
   * </p>
   */
  olView(80),
  /**
   * <p>
   * The value of this constant is 98
   * </p>
   */
  olItemProperties(98),
  /**
   * <p>
   * The value of this constant is 99
   * </p>
   */
  olItemProperty(99),
  /**
   * <p>
   * The value of this constant is 100
   * </p>
   */
  olReminders(100),
  /**
   * <p>
   * The value of this constant is 101
   * </p>
   */
  olReminder(101),
  /**
   * <p>
   * The value of this constant is 102
   * </p>
   */
  olConflict(102),
  /**
   * <p>
   * The value of this constant is 103
   * </p>
   */
  olConflicts(103),
  /**
   * <p>
   * The value of this constant is 104
   * </p>
   */
  olSharing(104),
  /**
   * <p>
   * The value of this constant is 105
   * </p>
   */
  olAccount(105),
  /**
   * <p>
   * The value of this constant is 106
   * </p>
   */
  olAccounts(106),
  /**
   * <p>
   * The value of this constant is 107
   * </p>
   */
  olStore(107),
  /**
   * <p>
   * The value of this constant is 108
   * </p>
   */
  olStores(108),
  /**
   * <p>
   * The value of this constant is 109
   * </p>
   */
  olSelectNamesDialog(109),
  /**
   * <p>
   * The value of this constant is 110
   * </p>
   */
  olExchangeUser(110),
  /**
   * <p>
   * The value of this constant is 111
   * </p>
   */
  olExchangeDistributionList(111),
  /**
   * <p>
   * The value of this constant is 112
   * </p>
   */
  olPropertyAccessor(112),
  /**
   * <p>
   * The value of this constant is 113
   * </p>
   */
  olStorageItem(113),
  /**
   * <p>
   * The value of this constant is 114
   * </p>
   */
  olRules(114),
  /**
   * <p>
   * The value of this constant is 115
   * </p>
   */
  olRule(115),
  /**
   * <p>
   * The value of this constant is 116
   * </p>
   */
  olRuleActions(116),
  /**
   * <p>
   * The value of this constant is 117
   * </p>
   */
  olRuleAction(117),
  /**
   * <p>
   * The value of this constant is 118
   * </p>
   */
  olMoveOrCopyRuleAction(118),
  /**
   * <p>
   * The value of this constant is 119
   * </p>
   */
  olSendRuleAction(119),
  /**
   * <p>
   * The value of this constant is 120
   * </p>
   */
  olTable(120),
  /**
   * <p>
   * The value of this constant is 121
   * </p>
   */
  olRow(121),
  /**
   * <p>
   * The value of this constant is 122
   * </p>
   */
  olAssignToCategoryRuleAction(122),
  /**
   * <p>
   * The value of this constant is 123
   * </p>
   */
  olPlaySoundRuleAction(123),
  /**
   * <p>
   * The value of this constant is 124
   * </p>
   */
  olMarkAsTaskRuleAction(124),
  /**
   * <p>
   * The value of this constant is 125
   * </p>
   */
  olNewItemAlertRuleAction(125),
  /**
   * <p>
   * The value of this constant is 126
   * </p>
   */
  olRuleConditions(126),
  /**
   * <p>
   * The value of this constant is 127
   * </p>
   */
  olRuleCondition(127),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  olImportanceRuleCondition(128),
  /**
   * <p>
   * The value of this constant is 129
   * </p>
   */
  olFormRegion(129),
  /**
   * <p>
   * The value of this constant is 130
   * </p>
   */
  olCategoryRuleCondition(130),
  /**
   * <p>
   * The value of this constant is 131
   * </p>
   */
  olFormNameRuleCondition(131),
  /**
   * <p>
   * The value of this constant is 132
   * </p>
   */
  olFromRuleCondition(132),
  /**
   * <p>
   * The value of this constant is 133
   * </p>
   */
  olSenderInAddressListRuleCondition(133),
  /**
   * <p>
   * The value of this constant is 134
   * </p>
   */
  olTextRuleCondition(134),
  /**
   * <p>
   * The value of this constant is 135
   * </p>
   */
  olAccountRuleCondition(135),
  /**
   * <p>
   * The value of this constant is 136
   * </p>
   */
  olClassTableView(136),
  /**
   * <p>
   * The value of this constant is 137
   * </p>
   */
  olClassIconView(137),
  /**
   * <p>
   * The value of this constant is 138
   * </p>
   */
  olClassCardView(138),
  /**
   * <p>
   * The value of this constant is 139
   * </p>
   */
  olClassCalendarView(139),
  /**
   * <p>
   * The value of this constant is 140
   * </p>
   */
  olClassTimeLineView(140),
  /**
   * <p>
   * The value of this constant is 141
   * </p>
   */
  olViewFields(141),
  /**
   * <p>
   * The value of this constant is 142
   * </p>
   */
  olViewField(142),
  /**
   * <p>
   * The value of this constant is 144
   * </p>
   */
  olOrderField(144),
  /**
   * <p>
   * The value of this constant is 145
   * </p>
   */
  olOrderFields(145),
  /**
   * <p>
   * The value of this constant is 146
   * </p>
   */
  olViewFont(146),
  /**
   * <p>
   * The value of this constant is 147
   * </p>
   */
  olAutoFormatRule(147),
  /**
   * <p>
   * The value of this constant is 148
   * </p>
   */
  olAutoFormatRules(148),
  /**
   * <p>
   * The value of this constant is 149
   * </p>
   */
  olColumnFormat(149),
  /**
   * <p>
   * The value of this constant is 150
   * </p>
   */
  olColumns(150),
  /**
   * <p>
   * The value of this constant is 151
   * </p>
   */
  olCalendarSharing(151),
  /**
   * <p>
   * The value of this constant is 152
   * </p>
   */
  olCategory(152),
  /**
   * <p>
   * The value of this constant is 153
   * </p>
   */
  olCategories(153),
  /**
   * <p>
   * The value of this constant is 154
   * </p>
   */
  olColumn(154),
  /**
   * <p>
   * The value of this constant is 155
   * </p>
   */
  olClassNavigationPane(155),
  /**
   * <p>
   * The value of this constant is 156
   * </p>
   */
  olNavigationModules(156),
  /**
   * <p>
   * The value of this constant is 157
   * </p>
   */
  olNavigationModule(157),
  /**
   * <p>
   * The value of this constant is 158
   * </p>
   */
  olMailModule(158),
  /**
   * <p>
   * The value of this constant is 159
   * </p>
   */
  olCalendarModule(159),
  /**
   * <p>
   * The value of this constant is 160
   * </p>
   */
  olContactsModule(160),
  /**
   * <p>
   * The value of this constant is 161
   * </p>
   */
  olTasksModule(161),
  /**
   * <p>
   * The value of this constant is 162
   * </p>
   */
  olJournalModule(162),
  /**
   * <p>
   * The value of this constant is 163
   * </p>
   */
  olNotesModule(163),
  /**
   * <p>
   * The value of this constant is 164
   * </p>
   */
  olNavigationGroups(164),
  /**
   * <p>
   * The value of this constant is 165
   * </p>
   */
  olNavigationGroup(165),
  /**
   * <p>
   * The value of this constant is 166
   * </p>
   */
  olNavigationFolders(166),
  /**
   * <p>
   * The value of this constant is 167
   * </p>
   */
  olNavigationFolder(167),
  /**
   * <p>
   * The value of this constant is 168
   * </p>
   */
  olClassBusinessCardView(168),
  /**
   * <p>
   * The value of this constant is 169
   * </p>
   */
  olAttachmentSelection(169),
  /**
   * <p>
   * The value of this constant is 170
   * </p>
   */
  olAddressRuleCondition(170),
  /**
   * <p>
   * The value of this constant is 171
   * </p>
   */
  olUserDefinedProperty(171),
  /**
   * <p>
   * The value of this constant is 172
   * </p>
   */
  olUserDefinedProperties(172),
  /**
   * <p>
   * The value of this constant is 173
   * </p>
   */
  olFromRssFeedRuleCondition(173),
  /**
   * <p>
   * The value of this constant is 174
   * </p>
   */
  olClassTimeZone(174),
  /**
   * <p>
   * The value of this constant is 175
   * </p>
   */
  olClassTimeZones(175),
  /**
   * <p>
   * The value of this constant is 176
   * </p>
   */
  olMobile(176),
  /**
   * <p>
   * The value of this constant is 177
   * </p>
   */
  olSolutionsModule(177),
  /**
   * <p>
   * The value of this constant is 178
   * </p>
   */
  olConversation(178),
  /**
   * <p>
   * The value of this constant is 179
   * </p>
   */
  olSimpleItems(179),
  /**
   * <p>
   * The value of this constant is 180
   * </p>
   */
  olOutspace(180),
  /**
   * <p>
   * The value of this constant is 181
   * </p>
   */
  olMeetingForwardNotification(181),
  /**
   * <p>
   * The value of this constant is 182
   * </p>
   */
  olConversationHeader(182),
  /**
   * <p>
   * The value of this constant is 183
   * </p>
   */
  olClassPeopleView(183),
  /**
   * <p>
   * The value of this constant is 184
   * </p>
   */
  olClassThreadView(184),
  /**
   * <p>
   * The value of this constant is 185
   * </p>
   */
  olPreviewPane(185),
  /**
   * <p>
   * The value of this constant is 186
   * </p>
   */
  olSensitivityRuleCondition(186),
  /**
   * <p>
   * The value of this constant is 187
   * </p>
   */
  olClassMessageListView(187),
  ;

  private final int value;
  OlObjectClass(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
