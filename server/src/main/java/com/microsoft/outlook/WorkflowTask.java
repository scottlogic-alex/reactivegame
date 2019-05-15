package com.microsoft.outlook;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000CD900-0000-0000-C000-000000000046}")
public interface WorkflowTask extends _IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  String id();


  /**
   * <p>
   * Getter method for the COM property "ListID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  String listID();


  /**
   * <p>
   * Getter method for the COM property "WorkflowID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  String workflowID();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  String description();


  /**
   * <p>
   * Getter method for the COM property "AssignedTo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  String assignedTo();


  /**
   * <p>
   * Getter method for the COM property "CreatedBy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  String createdBy();


  /**
   * <p>
   * Getter method for the COM property "DueDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  java.util.Date dueDate();


  /**
   * <p>
   * Getter method for the COM property "CreatedDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Date createdDate();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  int show();


  // Properties:
}
