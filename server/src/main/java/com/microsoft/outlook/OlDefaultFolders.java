package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlDefaultFolders implements ComEnum {
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFolderDeletedItems(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFolderOutbox(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olFolderSentMail(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olFolderInbox(6),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  olFolderCalendar(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  olFolderContacts(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  olFolderJournal(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  olFolderNotes(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  olFolderTasks(13),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  olFolderDrafts(16),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  olPublicFoldersAllPublicFolders(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  olFolderConflicts(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  olFolderSyncIssues(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  olFolderLocalFailures(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  olFolderServerFailures(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  olFolderJunk(23),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  olFolderRssFeeds(25),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  olFolderToDo(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  olFolderManagedEmail(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  olFolderSuggestedContacts(30),
  ;

  private final int value;
  OlDefaultFolders(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
