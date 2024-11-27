# Create Administrative Report

## 1. Analysis Classes

### 1.1 Boundary Classes:

#### 1.1.1 ReportRequestForm

**Properties:**
- reportType: String
- startDate: Date
- endDate: Date
- employeeNames: List<String>

**Responsibilities:**
- Display input fields for report criteria to the Payroll Administrator.
- Capture and validate the report criteria entered by the Payroll Administrator.
- Notify the ReportController with the entered criteria.

#### 1.1.2 SaveReportDialog

**Properties:**
- fileName: String
- fileLocation: String

**Responsibilities:**
- Prompt the Payroll Administrator to specify the name and location for saving the report.
- Capture and validate the save information.
- Confirm the save operation.

### 1.2 Control Classes:

#### 1.2.1 ReportController

**Properties:**
- reportCriteria: ReportCriteria

**Responsibilities:**
- Receive report criteria from ReportRequestForm.
- Validate the completeness and correctness of the report criteria.
- Handle exceptions for missing or invalid data.
- Initiate report generation by interacting with ReportGenerator.
- Provide the generated report to the ReportViewer.
- Coordinate the save operation if requested.

#### 1.2.2 SaveReportController

**Properties:**
- report: Report

**Responsibilities:**
- Initiate the save operation upon request.
- Interact with SaveReportDialog to get save details.
- Handle the actual saving of the report to the specified location.
- Manage exceptions during the save process.

### 1.3 Entity Classes:

#### 1.3.1 Report

**Properties:**
- content: String
- type: String
- dateRange: DateRange
- employeeData: List<EmployeeData>

**Responsibilities:**
- Store the data generated for the report.
- Provide methods to format the report for viewing and saving.

#### 1.3.2 ReportCriteria

**Properties:**
- reportType: String
- startDate: Date
- endDate: Date
- employeeNames: List<String>

**Responsibilities:**
- Encapsulate the criteria needed for report generation.
- Validate individual criteria components.

#### 1.3.3 EmployeeData

**Properties:**
- name: String
- totalHoursWorked: Double
- payYearToDate: Double

**Responsibilities:**
- Store employee-specific data required for the report.

## 2. Sequence diagram
![Diagram](https://www.planttext.com/api/plantuml/png/TLJBRkCm3BphAuJUzmToMDImsw30xjQm0TyLcqdPof9NabFqxvTw-DtD8OdCuN268lredJ1kx2LZzWCLDze2S-Way8VSW730iwv7XTOPuV0El8916_V0c6YTDhmKNqPBkGBHGs5vcR6B7bKdp5TAgU3l2DOzQzDxG5KzirOhHza9aCUJX41GvGmKAPdISuCE38eOIuSTmnaKp0ggyvOWFDkBQX0-KxrcYTNY3Z5Ue93wvkDrLSpLblXMSqsYMPdn7p-zlHD_7K1DrPDzxlqpYdfGcPruWNQGOXOvstnHmqXe1DdPDUUJelWUFH5M-OdNuwL7TqJa4P3E9vwkTzVTryixjEw8ReJ4pkCFXCJq1kq7n-iY7crCO49kBDt3GqwVbEqTbKRtW-DNkhRVQ2sg6wU_2Ko_5EXfzhIAYSVMFHdZSy5QSOC0MlMBsE_OaMvj33c3_p9w9nNOsBtP9KYxU4wcLlhF9vw6Rkea_qJtjkjgp3Y7Z5tZrw4Wm8r6RMAnK7EO5AUdvUERxOjPpTIaqe2bFLXJfkuGfH__xoFJk58LF-qRHO6xzd9V53hqPWA6njqiRQsZSjgRpHK7P05EeBG9L-mlD6B2wgra1QOu_W7mH_J0XUhuBzskonQplBGAtvJCqrraRKjZCoyBRJFrQYlVyomT20qPeCKhmg5oFXaXeYlIUouavkHTGe21wjWZVVaNxZy0)

## 3. Class diagram
![Diagram](https://www.planttext.com/api/plantuml/png/lLNBRjim4BphAtXBYy8_81X64jjD2mHjuGGjSbnBQva8HQfBogaGzD-x52bRhnGzDOV4cPqbP_P1Nri7vEfI9LTYWmUfKLY7XCOr5Lhn8jrHvD8wgJCdCgCCMN4m938595sJs6UfAo0eFMAjU4q4_zn2zboGgNM-zYdBvTv_1cfMAt4lYwExLJNECpEZ7HdL4Uy8KSypKJjMq16VK2dpalnEsCXDvWmbGT0tQFWuTPENKhCF0Ww9vH8yXNDVGyPjr2VMFWbjJDvXPSZjy6UDrdqqL8g1bM1s8QYbFNB5Kl7WIEeY1jhYRi0nxdz757K-nSfAcGRn2vHeKxPatJ8SjGgCHVldWsz6fQ3nOjwzZrW6bQi9F-kgTcVm14hcVC4GjVM-b6xDlKEIm33R3ruVu8J1xqQ2CiMyrODKhSQHKG_VcmoSD7eO6kaEPu-L-xitw40gUmaPVP1K-b2GUINMOJPccnHZ2drtBqCqR57dE-sIulz3gOGPoXFsYZIiw2Hm19qht1BnTfn17ZSdcHrkkaEDr9RdJAZ8d6GUu_ET-2TJdPcXYUxwMB--K0zzhSPoIj1GjB7jhmmh7xDTuRVjgitMNVGMiTFbbJ8ucX4ttGzVpHte8kv2-t6q48n3t8Tj3nfj1Jz99VWD_IxnvMpfZ5w6Q30oiOzp5lxdIe_dQctAocYMPFkQ--xd5ElfLZhZG7qoDTaVXfunPtcctgjEO0ND4m8zcYWznDg6xr2rqs6FihB9x1kwMAnctiUK1uzDyFCQlZoIAUMIs1llDBvCLcHTLvn99hHURaTBEGFPWFqRcrb5sC2tUBDBnsSRGxdKFY_ucUKD3uZlPofglomJt9DdApgftPjtdKrPPdI6siXWIb8UOvu7F66INFE8-g_vFm00)

# Create Employee Report

## 1. Analysis Classes

### 1.1 Boundary Classes:

#### 1.1.1 EmployeeReportRequestForm

**Properties:**
- reportType: String
- startDate: Date
- endDate: Date

**Responsibilities:**
- Display input fields for report criteria to the Employee.
- Capture and validate the report criteria entered by the Employee.
- Notify the EmployeeReportController with the entered criteria.

#### 1.1.2 ChargeNumberSelectionDialog

**Properties:**
- availableChargeNumbers: List<String>
- selectedChargeNumber: String

**Responsibilities:**
- Display the list of available charge numbers from the Project Management Database.
- Capture the selected charge number from the Employee.
- Provide the selected charge number to the EmployeeReportController.

#### 1.1.3 SaveReportDialog

**Properties:**
- fileName: String
- fileLocation: String

**Responsibilities:**
- Prompt the Employee to specify the name and location for saving the report.
- Capture and validate the save information.
- Confirm the save operation.

### 1.2 Control Classes:

#### 1.2.1 EmployeeReportController

**Properties:**
- reportCriteria: ReportCriteria

**Responsibilities:**
- Receive report criteria from EmployeeReportRequestForm.
- Validate the completeness and correctness of the report criteria.
- Handle exceptions for missing or invalid data.
- If report type is "Total Hours Worked for a Project," initiate charge number selection via ChargeNumberSelectionDialog.
- Initiate report generation by interacting with ReportGenerator.
- Provide the generated report to the ReportViewer.
- Coordinate the save operation if requested.

#### 1.2.2 SaveReportController

**Properties:**
- report: Report

**Responsibilities:**
- Initiate the save operation upon request.
- Interact with SaveReportDialog to get save details.
- Handle the actual saving of the report to the specified location.
- Manage exceptions during the save process.

### 1.3 Entity Classes:

#### 1.3.1 Report

**Properties:**
- content: String
- type: String
- dateRange: DateRange
- employeeData: EmployeeData

**Responsibilities:**
- Store the data generated for the report.
- Provide methods to format the report for viewing and saving.

#### 1.3.2 ReportCriteria

**Properties:**
- reportType: String
- startDate: Date
- endDate: Date
- chargeNumber (optional): String

**Responsibilities:**
- Encapsulate the criteria needed for report generation.
- Validate individual criteria components.

#### 1.3.3 EmployeeData

**Properties:**
- name: String
- totalHoursWorked: Double
- projectHours: Map<String, Double>
- vacationSickLeave: Map<String, Double>
- payYearToDate: Double

**Responsibilities:**
- Store employee-specific data required for the report.

#### 1.3.4 ProjectManagementDatabase

**Properties:**
- chargeNumbers: List<String>

**Responsibilities:**
- Provide access to available charge numbers.

## 2. Sequence diagram
![](https://www.planttext.com/api/plantuml/png/XLRBRjim4BphAmZVymCw50aanItGE86KkcTQNjjiA58bAGV---wI4lMmsWf8d90povtbxCgFrd7ZkaOcYVqGYXbj8N72IM2Rp0071wneMgbl0Ao4LXl77bW5lpjGDR1SyBFXpIP9UEsq6Q7SiY8vw4uTkRd5vH2W9BPrpzeq7bUMpqcjbJDQBf1PM9LW0Z1BG65ojpwJp0W7Hd3QB8T_1iYRqR-WTYzSyJCqk9Xpnm_S-jpUNl8nk-p2pHbsNNC0Ku54aj0AbKbz9cosg_AONpXu2meC9y5qydQUbLyReuV5lO3FeABSns0LlwuAhL1ev8-WCQMgp9EaO0zVVF5Izjg26axlgykel0bjUrYALsLRoMEIiNRVLDiXMe0yscdCGk7-4Zq6BBEKLTsX4Mu5an4ataZAo4aEbhVsUg0BMe7lkHH78Yn3-bEp2zGVJ9n62S86IiBbJDZLBp9y8f-KeJEQrh4JNj-Bi5QeCyC_UpX-uaR3oGCzzQw4XJ741MlHMW4qYtuLHynT6uFou1yHIKq9DbHnzA-qe_9U6D58N5_gzriBf7hphXsNxAlkZ6K_jVd0qqWM7zo_ySn91T3uQRJ8qvKBoG_Oww45MEW16qc8Zeb6NUlGFZurorYe6PR5tcB1oP5Bf4M9_vjQCPuMuiw1zx4dXWq4hDKwvTwGFzgP7TcdS9SLCgYPsyfjolf94MUdPyxxm5FAhMSiMcMorPl5TKPDDuUZzdSDxdGSfY7ClY_ncm6B0siMPOX1OsgwGPwBCpsxQ7mxM8fCGscAcmKPxFKNN4Ya8ZtVb722v7eSJZ4pTWazLL27usxMjHwTWqEBs0bswQ40crkjYF72VFEO7M_mhQ2ExBkkbmdaCTd1FEk7P_tzFTKrpeKu4t6kOwtl1L6yiJQ-L2tKuYHWDOkibuRnJW9VcvwROK4aHAIV6_6oSeqtjTDkzGgKnfhhAyttT4W1nmaMhkRc2CVePlfvn5_q1U4F)

## 3. Class diagram
![](https://www.planttext.com/api/plantuml/png/fLPTRzem57tFh_1RMstyWGYXhi2wILqdGRMfZvVa0XwEdLqxTAZQVzzrugH9IDDfum6IUu_jS-wNkROEo1MPYYx40hTIex0E2OqxvMZ5atHxaKhhf4wSI8moPCNMa4WKa7Ido1wape4WynPhnNCa-7C3oM57fj3ft2-PJZV-6UWqcuaxkTkx6rNWC38nsf5HDV2M4FKm4hLZ1ZNm4PKoJz7lY8LyI9oXg2Aqp79bJeXYEWLlPlnp2Re9bCJSuz3sy2lC3RaL_YpGke-6Cj5HKUcS22fX3noiMAmTIRqBZZAk2t1izz_1YZhjsoRbppiVvLp1oHzrUHLi2UIk8Foiyy8rnYCecVBohjKMcqowEIS5IGARMMIbQBu7sk5zaMsGrgWmSTBeXGHbTiEQu0XImKPXUwMDESxMJIkHirfbkH-cRMGt43rvrRbzWGsjdfoslT6pXcF8pfY8hLHu3ra_BTvyPnBmc_uBKJvxWOxZOrzSHcybPTvLqRmGywg8HqihO1IIQ5Tzjx3gVCPYrNdlKYPCK1wnbVnkfPmvzg1JXKiYRkV6ABLqqgE7wkKCLV6vHOq47K1EvYZJu1_Esrz9hoLtfTR7XsYtvNZJrxnF9mCDkzAt_9LWxdssJjEod22zB5MdYjPygNbvfcpiLPGxxtqVynNeNUZpyh4U0A46sCv9NRRUkZfvncRWvyutYK-DcCRwKcnjqdMUXyZ__w0IoPjDtY-ukSboevcBRPDjgnwYgi_RrXa7wfCfo7utTC2KUPc29rHmSytzu3ej0R7u0daOK-y3h1vNHwWwVosJmnro3CV0EPmU4UZ1X41K1vQ5iq9LxcFtChTHSyLC9hEH-oFcukMey2rKtQlHwz3pZLej4uVXQ4LIvzkPw5MutwjN7Z6lH1PbnrUDNHnnqubMNCgjq8WffbVHs9gsghUYCIY05-sgWVCMzS5PmxADeLJgadLvw22kkq4ZkF0puim-BkhL_Hj1bX4s2g_jpShkYBblkJZnY55qpJtf_wZz0G00)

# Login

## 1. Analysis Classes

### 1.1 Boundary Classes:

#### 1.1.1 LoginForm

**Properties:**
- username: String
- password: String

**Responsibilities:**
- Display the login screen with fields for username and password.
- Capture user input for username and password.
- Submit the login information to the LoginController.
- Display error messages if the login attempt is invalid.

### 1.2 Control Classes:

#### 1.2.1 LoginController

**Properties:**
- None

**Responsibilities:**
- Receive login information from LoginForm.
- Validate the entered username and password.
- Interact with UserAccount to verify credentials.
- Notify LoginForm of successful or failed login.
- Initiate user session upon successful login.

### 1.3 Entity Classes:

#### 1.3.1 UserAccount

**Properties:**
- username: String
- passwordHash: String

**Responsibilities:**
- Store user account information.
- Provide methods to verify the password.

## 2. Sequence Diagram
![](https://www.planttext.com/api/plantuml/png/ZLFRRiCW37tdAwmzhp_GXwbHraoJiejMTUzkuhQe13f3LlNlPw2tJ5Ktf4I0p_71FZ3n0JdqdL7ARxG5TfvKqC4GtDLk9JiZcD5NJxOXQ3Mk6BixfR09Zc7kYG4zpDN2zRP5taFYL8wxk5zNgd4si3DvlymBarbrgSYAr3xbAPf6SeIKhb1g3gC7uO_XRKisis7MC95LTHLZyp4yQhyrcEaMEmAqBRoZzpl7BLIQJElFYQOs45_77bBMvHXc_QBJuI3uR9TI2GRjHBLCgiKOFj7e5WD1oTJ62j1uXIPShZD8WOnCZ2TuTK4lzyTY-gOXxpFaMD4WjEpDFHHf2a-CSlnMaV43NJdYzrzA5MhJCmsLZhsRCekHBwA1gmmvDQnSExaC41nyK11h1LUYN0EJOB7Wv7yCQig5n66SsnuOIVyK62I_vSObuH_E3E2tNRg4BfXm0xkrNA_hniL1DizJtrEvkGNdLB-yos531vhGupUHNtnZFm00)

## 3. Class Diagram
![](https://www.planttext.com/api/plantuml/png/ZPF1Rjim38RlUWhUrgB82nX1q2Phkm8TC3JOeKTMfXsXicIGT88WsBjFiXqdwN9OBWd8Zyh__vJkHP6rQxpv1j-fSe50b9YYxbiIs3dTGEb4NR0ADlh80bLai1xPwTx8fmijCZQv8W870-cpHFjPS-n2kSeZy_b7_esyNopWrTKRNVgEhfCs1kNeZ-0p4uNh90LD2exWEtaVT-QFIKOUh4OsWw3VGWppEUPIOWyzi1pbm2ep8_aQQnUU8ZTmeNTmD8Ck7HImeGBMoYxKOxbDexl8vMLvrd_TvUXQZ_l-wBNDNcvknvR5LZkcbz1sEXMb-sYSzlXK6yzuP8xyaqImfjJhVQo6iFwrCJPyx_qKwU5I7PCbjwL-uYLKSVhBBNfNejAAgSmnevUf5wAwQd3qHjBvatWNN4ALSkJh9DJ5S1JwsE_gGcUc7gnDGIkSBVC_u_w1ihaU-POuwVirSZTVztDRfEr7JnW6PM_aKPDIsRXMJ7zRPhF5sMKeag_q8j856fw3ERKcy2pkOjoXWC-TD5n5q6Y-SddsF89Y2bq0QtH1rDnJAFFJ_0i0)


# Maintain employee information

## 1. Analysis Classes

### 1.1 Boundary Classes:

#### 1.1.1 MaintainEmployeeForm

**Properties:**
- function: String (Add, Update, Delete)
- employeeId: String
- employeeData: EmployeeData

**Responsibilities:**
- Display options to select the function (Add, Update, Delete).
- Capture and validate the function selection from the Payroll Administrator.
- Request and capture employee information for adding or updating.
- Display retrieved employee information for updating or deleting.
- Notify the MaintainEmployeeController with the provided data.
- Display the new employee ID after adding an employee.

#### 1.1.2 ConfirmDeletionDialog

**Properties:**
- confirmation: Boolean

**Responsibilities:**
- Prompt the Payroll Administrator to confirm the deletion of an employee.
- Capture the confirmation response.
- Notify the MaintainEmployeeController of the confirmation result.

### 1.2 Control Classes:

#### 1.2.1 MaintainEmployeeController

**Properties:**
- None

**Responsibilities:**
- Receive function selection and data from MaintainEmployeeForm.
- Validate the data received.
- Handle the "Add an Employee" process:
  - Create a new Employee object.
  - Assign a unique employee ID.
  - Set default paycheck delivery method to "pickup".
  - Save the new employee to the system.
  - Provide the new employee ID to MaintainEmployeeForm.
- Handle the "Update an Employee" process:
  - Retrieve employee by ID.
  - Handle cases where the employee is not found.
  - Update employee information with new data.
  - Save the updated employee to the system.
- Handle the "Delete an Employee" process:
  - Retrieve employee by ID.
  - Handle cases where the employee is not found.
  - Initiate deletion process.
  - Confirm deletion via ConfirmDeletionDialog.
  - If confirmed, mark the employee for deletion.
- Handle error cases and notify MaintainEmployeeForm.

### 1.3 Entity Classes:

#### 1.3.1 Employee

**Properties:**
- employeeId: String
- name: String
- employeeType: String (hourly, salaried, commissioned)
- mailingAddress: String
- socialSecurityNumber: String
- standardTaxDeductions: Double
- otherDeductions: Map<String, Double> (e.g., 401k, medical)
- phoneNumber: String
- hourlyRate: Double (for hourly employees)
- salary: Double (for salaried and commissioned employees)
- commissionRate: Double (for commissioned employees)
- hourLimit: Double
- paycheckDeliveryMethod: String (default "pickup")
- markedForDeletion: Boolean

**Responsibilities:**
- Store and manage employee information.
- Provide methods to update employee data.
- Mark the employee record for deletion.

## 2. Sequence Diagram
![](https://www.planttext.com/api/plantuml/png/VPB1Ri8m38RlVGgBqoQn5-0mKRL5ui2eXjZTD6Q4fKcNk4nz-pcge1KhEqIAh2-_V__nCZ1wRckJOCNEGucTTyQagjPM1_OOYnYWJ9E3Qwr2ty46jMKvHTqOrn6jdAyZiobMIUKiYy0V9klhXdnFPWbPrjp15OZb8adA55vUez82jWtPcyx0nMw9094hqmNaEZG6ErYrjcBjBEp8K7zxIfMQmxvHo3I7NEfCp-CMFGepuG277hEhllWKg3tKcgVq7xwBljxfkwN0W_6rFOfrZ2_77WhB4ieaDU7Y0PVTk0yqEixxBrai8FCKgJVw6SZjuIoJZQ0q1FrfOM-rp39Ip6Lg9K6mX7h4rd3Sc-f4rLTCMLyeRWdnoQcHs0ul8mrsiEi2Kpsubp1AxovQtTbQvrF_VOyioQgunxy0)

## 3. Class Diagram
![](https://www.planttext.com/api/plantuml/png/XLLDRzim3BtxL-ZM3LlGUn04RP9sAD0MGziTTcGa9XQY3q-Isnd1_lieMsuTLsu36B75HufyUgGkV00NQgsACxR1dJJ8V427DZGLUlOYGyc4z44Q7XYtoZhFTjOnhi39q1J-84q53dHSyPuT2qQ_5V33tjdQY7LqMIosyHrSirooMxalmqhLc4ToQuApgWV-S8WcZqGJA8CU-1kLiY_5lu8AkUJ1kg9Bw2Sq54vT2YqDrU60J6onW0WXtsFdiKhviNLqGf-Sxq2QGC-LhfHj4A-jq-oacgxU6TlLH92qPiuUWvDcdvOnETw82SC60ipPrU2h0ypQls-H-qf1Svt2FwB2zkNBrmJWK8NQuJJ0uPyQVUYtk35qV1foCJw2f3m-WlXwgsM89Oozxl7brL6GaIZl-5rRivDERoZf66eZGTbzdc3UGQ4ZUMMjGZ2dN5NEwYgi1y1nXLbRb_V8rAfYtMcn4yM49196OLJLctYFfwavv2YVFpYbPr1IGC0J-aemGk6b4Frc8yklAhfC65jItnk9f6SfS7mUP-ogRQUJMdiG6pJRyJDb6z0u8VOdcYaZamQfw8jgTEZzoEWj9qKy8g_ZhBclzHRT618WAaKymTyDYhebbS9iRBrLc30sbEY6rZke5bsKxmcvJD2gj0Qp6vMsTgfv8Bv7qJtGA6n6YzngBRsdxJ8UCTIj9CsDrYjeU8dyG2T7Md7D7ORIZkdLu0ueQ13rJJFH31x3SAgydlz-OZt67KJjLV60gcq9NyhA5zbXEfijyuDopcWH7OtQxY8figYS-w2fvga_FIEj0mlsNPG1ECPw5UsSSOV4lZ-lspxnvw9j2L_anqvqpXRuQHsZ3FBXvsa-fVjpC6wA2pGYNi7_0G00)

#  Maintain purchase order

## 1. Analysis Classes

### 1.1 Boundary Classes:

#### 1.1.1 PurchaseOrderForm

**Properties:**
- function: String (Create, Update, Delete)
- purchaseOrderId: String
- purchaseOrderData: PurchaseOrderData

**Responsibilities:**
- Display options to select the function (Create, Update, Delete).
- Capture and validate the function selection from the Commissioned Employee.
- Request and capture purchase order information for creating or updating.
- Display retrieved purchase order information for updating or deleting.
- Notify the PurchaseOrderController with the provided data.
- Display the new purchase order ID after creating a purchase order.

#### 1.1.2 ConfirmDeletionDialog

**Properties:**
- confirmation: Boolean

**Responsibilities:**
- Prompt the Commissioned Employee to confirm the deletion of a purchase order.
- Capture the confirmation response.
- Notify the PurchaseOrderController of the confirmation result.

### 1.2 Control Classes:

#### 1.2.1 PurchaseOrderController

**Properties:**
- None

**Responsibilities:**
- Receive function selection and data from PurchaseOrderForm.
- Validate the data received.
- Handle the "Create a Purchase Order" process:
  - Create a new PurchaseOrder object.
  - Assign a unique purchase order ID.
  - Save the new purchase order to the system under the Commissioned Employee.
  - Provide the new purchase order ID to PurchaseOrderForm.
- Handle the "Update a Purchase Order" process:
  - Retrieve purchase order by ID.
  - Verify that the purchase order belongs to the Commissioned Employee and is open.
  - Handle cases where the purchase order is not found, access is invalid, or purchase order is closed.
  - Update purchase order information with new data.
  - Save the updated purchase order to the system.
- Handle the "Delete a Purchase Order" process:
  - Retrieve purchase order by ID.
  - Verify that the purchase order belongs to the Commissioned Employee and is open.
  - Handle cases where the purchase order is not found, access is invalid, or purchase order is closed.
  - Confirm deletion via ConfirmDeletionDialog.
  - If confirmed, remove the purchase order from the system.
- Handle error cases and notify PurchaseOrderForm.

### 1.3 Entity Classes:

#### 1.3.1 PurchaseOrder

**Properties:**
- purchaseOrderId: String
- employeeId: String
- customerPointOfContact: String
- customerBillingAddress: String
- productsPurchased: List<Product>
- date: Date
- status: String (Open, Closed)

**Responsibilities:**
- Store and manage purchase order information.
- Provide methods to update purchase order data.
- Track the status of the purchase order.

#### 1.3.2 Product

**Properties:**
- productId: String
- productName: String
- quantity: Integer
- price: Double

**Responsibilities:**
- Represent product information in a purchase order.

## 2. Sequence Diagram
![](https://www.planttext.com/api/plantuml/png/ZP9DJiCm48NtFiMeAv3W0bcW8YULs928gEoTP01N_Wdsf2YtnwwXX2Ggh6nvFh_tPZHRJyBHe1KJBLa7t6ejlPVMO5VeNjaH4OG7Nh363gOJReHgSEsRy5Yw3jtEEXs1gjonrXfoLlq6U7fKw1B66HgID9D9DSPu0RTtKIo3iaTpXY1HqOs5QeHuaK4kVQ_42Bl1j1H2GuqAq-sAEnI4Dx3lkzEPXnBXzTGYqR19A8YPtURRAgGEyD1eIMjMV_wFKP_mVK1FyuuUp4leIKITQRB2K2XUO5UINQJvcNuMIiQ9_8lFuAktH_oOVoYRGnZ0bBqFc_DgO6zaw7MXdq_HMXmN15ceHq-eVy0mYihPe-nM4vma5ykm3cxHT77FFm40)

## 3. Class Diagram
![](https://www.planttext.com/api/plantuml/png/ZLLBRnen4Bxlh_0jhIgK-mgX14Wgf2Y96lNGesCFOCLhRyRZH0ZrlzTUcuZTDL0kh6Q-UNtpy8qZZkGRNLsn9QoL0UO842pjMd3iKz6MIUL86K5CM6tHiRL59ZH7HRlAlIdJSkHDb3Z7zXKBlpaNRnkqtiX5D9bEN-CtnzrinXxKPajpxQ6C5DOGMdq0_aG0KqQ2eP310VW7jBQVrTyg578ho6AL4bhOfb7EAMj0tZMjjZi0Dfto20cs-sGnp_cnHJG2busVFOejT_244l3UOiDwfQHY9spj0piXGirU29NPP75xRBsIvxHBJhpkXukY19rqVpzY7rhDT_SvsWjew3w-VSy0mLlo2AS12EyU7FNYh4pePyDBZYxYSaONSSw_DefYHKFJH_ZiMyk022qvDC-i5JRBK4ZqjrHSsqsv1o91UUh3t5eDtFJvQz4sBIsEWCE2YxgK_43LJSqYpMeQcjB8P806PCUJlU_dXI10VPnfsmVNIdA27e5RRgI61K9Gz88E4BzRUG7HqNi24JZxK1AAFRfYTzqAdbiQThId-__Q2yXBEb88xyWsWCzM6NfQHsx35fy0pPNMGNeh9O9pmzL3AxqWTyWqH7e8DsxwdEIp38kyrIoG3baGRYNvWRD34ntGQ7s_MDoKbLzpdWCNoKggyVb8yaVUm43pxdddf6OhGx01_B9G8jPZ_Qk6rBzVeBk1TblLkgfuAYUJMU4CrYpq033mdzw8QWmP6HujGvsNoaMEEIDRdKAEl0HRqSsyk_RTPBjhsSslw_j8bfdNEfu7uih48aid9OABvPylT91esNUT3qz-E8_kI7K3HiQtzny0)

# Run Payroll

## 1. Analysis Classes

### 1.1 Boundary Classes:

#### 1.1.1 BankSystemInterface

**Properties:**
- None

**Responsibilities:**
- Handle communication with the external BankSystem.
- Send bank transactions for direct deposits.
- Receive acknowledgments or handle errors if the BankSystem is unavailable.

### 1.2 Control Classes:

#### 1.2.1 PayrollProcessor

**Properties:**
- currentDate: Date
- employeeList: List<Employee>

**Responsibilities:**
- Initiate the payroll run at scheduled times.
- Retrieve employees who should be paid on the current date.
- For each employee:
  - Interact with PaymentCalculator to calculate pay.
  - Process payment based on the delivery method (print paycheck or send bank transaction).
  - Check if the employee is marked for deletion and delete if necessary.
- Handle alternative flows, such as retrying bank transactions if the BankSystem is unavailable.

#### 1.2.2 PaymentCalculator

**Properties:**
- None

**Responsibilities:**
- Calculate pay for an employee based on:
  - Entered timecards.
  - Purchase orders.
  - Employee information (salary, benefits, deductions).
  - Legal deductions.
- Retrieve necessary data from Employee, TimeCard, PurchaseOrder, and LegalDeductions.

### 1.3 Entity Classes:

#### 1.3.1 Employee

**Properties:**
- employeeId: String
- name: String
- payDeliveryMethod: String (mail, pick-up, direct deposit)
- markedForDeletion: Boolean
- salary: Double
- hourlyRate: Double
- commissionRate: Double

**Responsibilities:**
- Store employee information.
- Provide methods to access pay-related data.
- Indicate if the employee is marked for deletion.
- Delete employee records when necessary.

#### 1.3.2 TimeCard

**Properties:**
- employeeId: String
- date: Date
- hoursWorked: Double

**Responsibilities:**
- Store timecard information for hourly employees.

#### 1.3.3 PurchaseOrder

**Properties:**
- purchaseOrderId: String
- employeeId: String
- amount: Double

**Responsibilities:**
- Store purchase order information for commissioned employees.

#### 1.3.4 Paycheck

**Properties:**
- employeeId: String
- amount: Double
- date: Date
- deliveryMethod: String

**Responsibilities:**
- Represent a paycheck to be printed or processed.

#### 1.3.5 BankTransaction

**Properties:**
- transactionId: String
- employeeId: String
- amount: Double
- status: String

**Responsibilities:**
- Represent a bank transaction for direct deposit.

#### 1.3.6 LegalDeductions

**Properties:**
- None

**Responsibilities:**
- Calculate legal deductions (e.g., taxes) based on employee data.

## 2. Sequence Diagram
![](https://www.planttext.com/api/plantuml/png/bLNRZjem47tFLupsVNy0eMXLQAkLkYegz0C6PrWi73konqZv-zfU4h13G8r4BZFdp9pC9RmvHik-LHKADXQ-eJvjUyVKmdAPJ7LTLLt0I24xr0ml6-ojKMfZZI3d0cUv54PpiDNr2w234Z2XjwHvXKfuXNoVdoFo0D_RJfcUAF02Id9_eGts7BsJBQtGDYLwi1VYl1L7TFJRDcHBIkRCUR_e4zMQ6YzO6krAPk6U54GSIPmcwIxs77rjqBjciWSKiH1xutM3Tg3U0KsZx2ngXqbHcRfmLzMavw_rfCqB-EFrOBtB63eKaCHMqfb6amCsiAT0bmtiJ8DzfOpfu4TW4ehZjRiGZXav-TGiOBYFONiu15mPfPZ4JEDFul49tdMWjvYgCSiTPkhc_GQJcsTbOtL37UoG70y25DDr-zutCpT3lzz8Oc_rDKuJCIa2Aax5N9EIPx8zV10VJGFImGTA1I7aHehJg-yI_46pqcm7hPOk3VeQzYUiGkZ6IiqvcPIZEObhQKbmy7J6INwOgrY1KMYqm-rkF0jIxE42jgIR-J2nmCbv-Gh_rNWEXSMzeX4JZxGTSLRw0E5G-QqNCV71gmptNzA-uaM1Kd_EQqnbrarLtW_Nnxk_IXyxURWkLneUUmfZ5dSqz8t6TB4S8suEz3ndWbE-_b5j_Bs5K_m3_0S0)

## 3. Class Diagram
![](https://www.planttext.com/api/plantuml/png/dLPTRzem57tFh_3Rg2h-G8HG2tHJfLP3RQTfZtVsBR5mxEZQQHLL---papY02R2EXn3vdkjxpls26-k0N5sgx0jRuQlKoAn3GkEQ2YrxbwvWGbedDNUC6sN8ibT3Z2iWwPhCRgMkWA0C9zQoZupvpmBuTaEcrc8PN6Qpt-4Tg9dFsOFS56wXQXn7SgCT6HM1tmXHZoDHEyyW0d-XKkOz-vDv8RVS6SewGWlGs-V6QohPR0R1u3q-EjoYPyMM0NhaSAzz9bw18piGq4cSJjklQsPHY-3pGg2j3o2DdhZTUyuIurNlHyXHlk4jtshphb1iIYzeSjKnMtPPw8XXfBQ6nX-gDHcErlegxAUhfyLuJUHlMe73d8LdVuvbfKo3-E2hcRFmdDtrH_D3HLJhFj9aHzQHn3UC7lR5B70DKWo8gYCL0Vw2La-CchDeYGu5QA5mb-qV6jv0AlYjy4B-V8Q6V8GWIr2yLk364n9LyHuLg8tHofamjG-UA7wH9Iw1X3qZ9MBNDV42B7udWNJEOU2oGb6tgiRHRI_SjNsUj4B4iBqv-4WgVIzozkoPwKrlq51YSbH1iqBb-v2QHtI5ILrAe2sAhuOy2ljw6ACGT0-mu3T1upjjbxmfAqnDgddgMd3Vm4rPIclzFSV6MAWDEb-YU-tNJ0djECMqIVkOqfbS7HAwPY9OSBBN9h64dygLIESdQB8_JOW_yDvrudxbn-9K-u2ZO2TPGEdtZXk91mqla6y_9Icvx8HECTuEG-Xa7CSOx8tlVqljkyk1g-qnYGVSWDeDpmY9ex4_E_Fje3sXQllD5hAosT6odKxd8nidPtMOob7qCAJvi29QP7950WKUhZY97BhvygM7NNaPdsRrdBQX0tF62Nr-J-3ITla7UFhhszCOCnswXClzWgcrv252--_bOcMwVM6p6_yx7lu7_GK0)
