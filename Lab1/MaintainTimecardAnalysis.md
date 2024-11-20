# Maintain Timecard

---

## 1. Boundary Classes

### 1.1 TimecardUI

- **Interface Description:**
  - Provides the interface for Employees to view, update, and submit their timecards.
  - Collects input such as hours worked and project charge numbers from the Employee.
  - Displays messages, error notifications, and confirmation prompts to the Employee.
  - Interfaces with the Project Management Database to retrieve available charge numbers.

---

## 2. Control Classes

### 2.1 TimecardController

- **Responsibilities:**
  - Manages the overall workflow of maintaining a timecard.
  - Validates the Employee's identity and permissions within the system.
  - Retrieves the current timecard or creates a new one if it does not exist.
  - Interfaces with the Project Management Database to fetch available charge numbers.
  - Validates the entered hours against business rules (e.g., maximum allowable hours).
  - Coordinates the saving and submission of the timecard.
  - Ensures that once a timecard is submitted, it becomes read-only.

---

## 3. Entity Classes

### 3.1 Employee

- **Description:**
  - Represents an Employee within the system.
  - Contains details such as Employee ID, name, role, and current payment method.

### 3.2 Timecard

- **Description:**
  - Represents an Employee's timecard for a specific pay period.
  - Contains a collection of TimeEntry objects, status (e.g., draft, submitted), submission date, and pay period dates.

### 3.3 TimeEntry

- **Description:**
  - Represents a single entry within a timecard.
  - Contains the date of work, associated Project (charge number), and hours worked.

### 3.4 Project

- **Description:**
  - Represents a project from the Project Management Database.
  - Contains details such as charge number, project name, and associated metadata.

---

## 4. Responsibilities for Each Analysis Class

### 4.1 Boundary Classes

#### 4.1.1 TimecardUI

- **Responsibilities:**
  - Display the current timecard to the Employee, including existing time entries.
  - Provide input fields for the Employee to add or update hours worked and select charge numbers.
  - Display error messages for invalid inputs (e.g., hours exceeding 24 in a day).
  - Show confirmation messages upon successful saving or submission of the timecard.
  - Provide a submission button to allow the Employee to submit the timecard for approval.

---

### 4.2 Control Classes

#### 4.2.1 TimecardController

- **Responsibilities:**
  - **Coordinate Process:** Orchestrate the steps involved in maintaining a timecard, from retrieval to submission.
  - **Validation:** Ensure that the Employee is authorized and that the timecard data adheres to business rules.
  - **Data Retrieval:** Fetch the current timecard or initialize a new one if necessary, including setting the immutable start and end dates.
  - **Charge Number Management:** Retrieve available charge numbers from the Project Management Database and handle scenarios where the database is unavailable.
  - **Save Operations:** Persist changes made to the timecard in the system.
  - **Submission Handling:** Assign the submission date, change the status to "submitted," validate total hours against limits, and make the timecard read-only post-submission.
  - **Error Handling:** Manage alternative flows such as invalid hours entry or database unavailability, providing appropriate feedback to the Employee.

---

### 4.3 Entity Classes

#### 4.3.1 Employee

- **Responsibilities:**
  - Store comprehensive Employee details, including personal information and current payment method.
  - Provide access to Employee information for validation and association with timecards.

#### 4.3.2 Timecard

- **Responsibilities:**
  - Maintain all details related to an Employee's timecard, including time entries, status, submission date, and pay period.
  - Provide methods to add, update, and retrieve TimeEntry objects.
  - Ensure that the timecard adheres to business rules, such as immutability post-submission.

#### 4.3.3 TimeEntry

- **Responsibilities:**
  - Store individual work entries, including the date, associated Project (charge number), and hours worked.
  - Validate that the hours entered do not exceed daily or weekly limits.

#### 4.3.4 Project

- **Responsibilities:**
  - Store and provide access to project details, including charge numbers and project names.
  - Serve as a reference for associating time entries with specific projects.

## Sequence Diagram
![PlantUML Diagram 1](https://www.planttext.com/api/plantuml/png/fLRRRjf047tVhnZbeM_y019L29Ss3wHL7DBdmHvWs_KktGiHVzzP6ry8Sh0R992ztfavSyxnBFVEe_KXLy9BhmZkLYYrvo-yo9nIj1aaz3UGJWdc4dSMypiXCFN6mY8_A7CY4c9ZWixGdkgWzQD8ZVRMg7ffLjuhie8q5plLyOlYjbgjzb-k_hJcDwL-XHftbFFY73rkq77noGGUqCaKbigymMGYH9KOHbzRYCRmgAMNw0ckcXJDjdPGWtaCp-Ijf2F1B5ZB09fOSRqz9hbiRmpVoDTh36LhnEKE67LN3bOtiR7rhgANx9L5MQgPfTZtLRlzAj_gj5ESCIp9ftkOxT7k29v2lY7hHEV-Mq3UvRd1GPHyBjr1OUCgG9rTfUdo2xF36R-RO5qHbv1Ys5MxheTfah39PMELGTAzef9PLAqeZSVXyfqpIAEPG1UKvpTNUVRUCJue6nF0d_uyBgnbEwt8EPQkYEqYRsRuDM6sIlgY1v67Y1AaMEVNmG0A0lZnLjgyQ8adGzOjtJlY_qEgvpZsdE-hrjGvkTDb5hvaokTHko-mFXGY9XvzS4EbVp4UrPcdpudUMbwYL9GD5BuLNtZWazgNcPAGfcobRL0zq5JahF0FjMN2RFH3grDV7pK2NRk9ZvAfudTUynhRBHuehZXH8eDroQdYQPgTpexnWwci8JVsR2SeBLfHEowE2fj_LBx07Y6U9nCqanNc3x3MU6J9SQDe8DBBGTbBU1P91u9VqkzDyF14R_MyR1iX8hxdt_ZFuny0)

## Class Diagram with their behaviors
![PlantUML Diagram 2](https://www.planttext.com/api/plantuml/png/XLLDYzim4BtxLmovz0F2qci8PccRGg5TbjqjFK-isKIDB9cHd13A_lTAicGxphfxCioNtfkPDxwr3jcrjIhiGUe66Mjei3hWZXxTMH4mLGxrJb5H93iiFfjM2-Jp0jRhX-mlI_XR05GAhOKdMLE5B7vzZqRmWTkKL9RHS7C3Gjf6uHcgbfcq0vUItd_84PLHojU7lMdPmidmWGIW5j2m-HCSbe9V6cs79Bit9o1cmr2JjHwnZJcLqS-IQnp2NugN4QilHZiswcrIAL0Hz-IgpZHmgr67efbInFwip6c0UKGb1Je2gXjbpaGHP9_WNJW4I-s8qHC-IRU7-yJ-Ptoa3htxwiEtQ6dK1Zns9MsxhUMakvVCDzf9zvzfRZB2J9TYmi3MEiFTOrXLlkS39q4EfHfD9pLcPkPBa685ZuwbtYM3nfec9j_fgIdLooDQzSEAPAz6ECjaEhSh_7lFKdK1u9DPaksnDtY-9vP6F0PHhS9GQEhQQ77XyFfphPsmYIEprYzgYBo83mzlkdTNy4DQjtvAbdDvpJNQtnYRr48UfMXHnIszOYMc49BuLdaFapcAz7VKw0g-AOFk4a_UsZaqJ0sJ3KkHrNtPV3_aFVAExjfwIppfM4gvkrwMsXS9OXgPhq4DIif2ceNfN_BTehpfplHmEtYW8xxHoZ25Xderva2fdqqwHCFkTBuyr8Ihp5fz1m-akjErbuqjHWTskInVEKt5AzSgH6Ojp_bd6r8K_HbOV5g0MIxZjzTPNt1mVrmCIrWCwpXwfYZc1p0kquVVaXRXR_KF)

