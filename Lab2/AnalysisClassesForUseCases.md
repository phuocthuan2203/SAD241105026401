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

#  Maintain purchase order

# Run Payroll
