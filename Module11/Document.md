# Why
- bridge between requirements and design: translate từ functional requirements into a technical design
- assignning responsibilities: define which objects are responsible for specific actions -> a clear distribution of tasks within the system
- facilitating implementation: a detailed interaction model -> dev implement the system accurately, reduce ambiguities and potential errors

# How
1. select the use case
2. identify participating objects
3. map use case steps to objects interactions
4. create interaction diagrams (sequence diagram)
5. define object responsibilities
6. consider alternative and exception flows

# Outputs
- interaction diagrams
- detailed class definition with attribute and method
- description of interaction

# Problem Statement

The process of tracking student information, academic progress, and extracurricular activity participation during the semester is currently handled manually, which is time-consuming, error-prone, and inefficient. The administrator is responsible for tracking personal information, updating the student's studying status (whether they are actively learning or have dropped out), monitoring their fund payment status, and recording their participation in extracurricular activities. This data is stored across multiple spreadsheets, which makes the process tedious to manage.

At the end of the semester, all this manually tracked information must be transferred into an Excel file provided by the department. Additionally, report cards need to be generated for each student, with grades taken from the Excel file and entered into report card templates provided by the university. This manual transfer of data is labour-intensive and prone to errors, causing unnecessary fatigue and inefficiencies. Therefore, a Student Monitoring System is needed to automate this entire process, improving accuracy, reducing time spent on manual data entry, and streamlining report generation.

# Use Case Description: Manage Activities

## Brief Description

The administrator will manage the lifecycle of activities in the system. This includes creating new activities, updating details (such as name, description, type, and deadlines), enabling student registration for activities, and monitoring evidence submission for those activities. The admin can also delete activities that are no longer valid or needed.

## Flow of Events

### Basic Flow

1. The Administrator logs into the system.
2. The Administrator navigates to the Manage Activities section.
3. The Administrator selects one of the following actions:
   - Create a new activity.
   - Update an existing activity.
   - Enable or disable student registration.
   - Monitor submissions of activity evidence.
   - Delete an activity.

#### For creating a new activity:

1. The Administrator enters the required information, such as name, description, activity type (academic, extracurricular), deadlines for participation, and submission requirements.
2. The Administrator enables registration for students.
3. The system saves the new activity.

#### For updating an activity:

1. The Administrator edits the activity details as needed (e.g., name, description, deadlines).
2. The system updates the information and reflects the changes in the student portal.

#### For deleting an activity:

1. The Administrator selects an activity to be deleted.
2. The system confirms deletion and removes the activity from student access.
3. The system logs all changes made to the activities.

### Alternative Flows

#### Update Activity

- If the Administrator attempts to update an activity that has already passed its registration or submission deadline, the system displays a warning and prevents the update of time-sensitive fields (like deadlines).

#### Delete Activity

- If the Administrator tries to delete an activity that has evidence submissions from students, the system will prompt a warning and suggest archiving instead of deletion to preserve the submissions.

### Special Requirements

- Only administrators can manage activities.
- The system must support logging all actions related to activities for accountability.
- The activity management interface should be user-friendly and display real-time updates when changes are made.

### Pre-Conditions

- The Administrator is authenticated and has appropriate permissions to manage activities.

### Post-Conditions

- The selected action (create, update, delete, or monitor submissions) has been successfully executed and logged.
- Students are notified if the activity status (registration enabled/disabled, updated deadlines) has changed.

# Identification of Design Objects

## Explanation

From the problem statement and use case, we need to identify the key objects (classes) involved in the "Manage Activities" functionality of the Student Monitoring System. Here's how I identified them:

- **Administrator**: The primary actor who manages activities.
- **Activity**: Represents the activities that need to be managed.
- **ActivityManager**: A controller class that handles the logic of managing activities.
- **SystemLogger**: Logs all actions for accountability.
- **Student**: Students who may need to be notified about activities.
- **NotificationService**: Handles sending notifications to students.
- **Submission**: Represents evidence submissions from students.

## Classes and Their Attributes and Methods

### Administrator

**Attributes:**
- `+id: int`
- `+name: String`
- `+email: String`

**Methods:**
- `+login()`
- `+manageActivities()`

### Activity

**Attributes:**
- `+activityId: int`
- `+name: String`
- `+description: String`
- `+type: String` (e.g., academic, extracurricular)
- `+registrationDeadline: Date`
- `+submissionDeadline: Date`
- `+isRegistrationEnabled: boolean`

**Methods:**
- `+enableRegistration()`
- `+disableRegistration()`
- `+updateDetails()`
- `+delete()`

### ActivityManager

**Methods:**
- `+createActivity(activityData: Activity)`
- `+updateActivity(activityId: int, updatedData: Activity)`
- `+deleteActivity(activityId: int)`
- `+monitorSubmissions(activityId: int)`
- `+logAction(actionDetails: String)`

### SystemLogger

**Methods:**
- `+log(action: String, userId: int, timestamp: DateTime)`

### Student

**Attributes:**
- `+studentId: int`
- `+name: String`
- `+email: String`

**Methods:**
- `+receiveNotification(notification: String)`

### NotificationService

**Methods:**
- `+sendNotification(recipients: List<Student>, message: String)`

### Submission

**Attributes:**
- `+submissionId: int`
- `+studentId: int`
- `+activityId: int`
- `+content: String`
- `+timestamp: DateTime`

**Methods:**
- `+submitEvidence()`

# Class Diagram

## Explanation

The class diagram shows the static structure of the system, illustrating classes and the relationships between them. Here's how I constructed it:

### Classes

Based on the identified objects.

### Attributes and Methods

From the use case details and required functionalities.

### Relationships

- Associations between Administrator and ActivityManager.
- Dependencies where ActivityManager uses Activity, SystemLogger, NotificationService, and interacts with Submission.
- Notifications sent from NotificationService to Student.

## Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/VLJDRjim3BxxAOYUEgnv0MC8MYmz36XtcFS2YimPn6p949a0mR1t7sKfXb8hkvdYnx-F7_tCOeASfh5f-3Sv29wnQOHaH7ZevDIZ4tZtZiG7SWDq5nQSO0TVHyCC1p93CDD3qzZ5VkadSiGIZEBXJmFmcVeMo4dyT6R25Zg9cQADaw6nV1ZzGExnK_oSZ3C3lbYXCmaXw-lVjKfwlQG29blVxXVgaMsWMSYxybakymqiu91wLzm1JJ-IK__124OlduuJCLTzn3-As5TdZYDgEqVlHpHkcNLvAr5fpfwuxZZDlIO_e2X7dB4uec2DYVU5hSou3QYHLzVZbH_jrRHhH55ZWynCFa7ozvN8rCgzoBJ1f9fkfOshCDrvJADZ6vk8NoQ-xgKODcdlpG_hf1gRewvmxPanh0C8JQWAd-QqgfzgbWcplfTSd8p_g6WZru0MwOpVlT0licbthZ0gCvJO3iEPBERowFgRH9gSPjAEb8etrSQNtEt-2NGcrdNNA5h9pbbNkvXhEsdbXAnteg2RSzcIkTQGrpDfKflLUViVsEts6wMsa2wSOTzyz9Lu1VePDOyYTQew-4OPBQWi698kxgMlxQ65jBobfnfWAPKrqqBS64Evxtl5YgtesEai8hPu_v1weLGl3uwNBQwW9k0O3nJ4AwnvrexYh_mV)

## Explanation of Relationships

- **Administrator** manages activities through the ActivityManager.
- **ActivityManager** performs operations on Activity objects.
- **ActivityManager** logs actions via the SystemLogger.
- **ActivityManager** uses NotificationService to send notifications.
- **NotificationService** sends notifications to Student objects.
- **ActivityManager** monitors Submission objects.
- **Submission** is associated with Student and Activity.

# Sequence diagrams

### Create New Activity Diagram
![Create New Activity Diagram](https://www.planttext.com/api/plantuml/png/X991JiD034NtSmehgrHgEK25K2jWHxCW9t0dRcGncIapJb3Fne8ZSGMS9gdI2iJEiR-VxJ_v_lpQ9C4eRUECIM_i8OP4nWYB8yWU8w4G5FG1MolSiPnW1IMzj-GjmHDZ7R79Z44h8SAsQjXpaeZwPMpm4eE3R6hTeSUQOWQOOBipvANdNSgPsOVMLnWrLvwIKFCIwaa_X3D54OGFR54u-99YnvREmg8qHps8BH_HYvAahNJIkJR6nbmj2gi7NGVMOC_NJklaE0PFABWmgkXramjhy3DJ_jCcx2YVyiCfcdMXpY_NZzEhR7bjunrNIn1kID-fEVx2vlHAzQ1MAvuzxXrLEWoTmBm2Oya038oYx3SZNysjpD6vqQQqL9VroEasm0xPzOnieH1jLyYeLL8aIzpH5UplVXrxymhtgzNu3C4VE3OZuTOVIAsrbDAXTUwa8BDHLF_x_W000F__0m00)

### Update Activity Diagram
![Update Activity Diagram](https://www.planttext.com/api/plantuml/png/P99DJiCm48NtSugHLwtKS80AeLPaWqGHeaAiXtWKZN3iO4-GUZOM78ahu9Au9MLdptplpO_z_VcrIKfHXyu1f3Vn64DY01LrZEQvjwICsqRbG_I05UxvVM3VCDP2RQJE052Z8UBMTk8bQQHyWoPuZS6XAT8TUMev6gI4snsmrwFVAMtWDGpUKion_I4fT_UXBVnu19YLmEec6-4QXzyUYz62fiETNKqfMvFI4Z9yb9HHrjYorgmaBlqHPQuGrrKrLYZPYOR_Lf9g9kl4yoEbn7Qn17AA9OXZ510dvMoGDLf9lQF32qKllbsOM_8-wDG-siabcIMmItosVSZGfVMvgL5UHfpjej3ZPZFhGYvxqawiMSqxlPAyKvMEyvVf-joCjvUFSjhPQF74QN0AiCbe_c8_0000__y30000)

### Enable and Disable Registration Diagram
![Enable and Disable Registration Diagram](https://www.planttext.com/api/plantuml/png/T9B1JiCm38RlVWehfqvQuOuGsgJkWCGkx0cyneI89Xc9EsdFne57uXNmw0hhW5CY-yjl-tS-tjuNHIXB7pg0yk8ZvbGOGBnqZ6OLQTlnTUFBySH7Thv89l4fOeqRVkqvjeoD9vSf601g9MLSsk3ZGAOCROgIKuTcsOhVUpciAPBZR90ABjV0KQiTVj86jgcFbhB6DeSY71wI6_dX2Z0fWVMT2k4D5fRp7YiwITxREVBNB3DGy8YVClh8iJGivBjonYit4hTrFQYFsHFzM-cY_E2UhVwjN6ZFrHWV9jDebrnb9bRhYgGls3vJT6pDV6hmbTVfn0TMBEnc5zPyTwzhUF8v3CRygT_lB8dgpm0M7At-YKy0003__mC0)

### Monitor Submissions Diagram 
![Monitor Submissions Diagram](https://www.planttext.com/api/plantuml/png/T95BRiCm34JtF0NXLRBm1OAYY5Dl2jIRvWIq91X4z4b5ke3FraMFr2jKTlgn2tGdSXvcXj37s_jHbBAEmGF8XIFc96vvNIbJm9xCPSXfZFOX-PJnUPP1MRt3gakHjIpFOnzOX5CKhF7iNaONZSEMQIWU5G2P6MjiuCYYcSe49aNDoMFL6ELNrgcZI8FB5P9Wqu4bfPwanFpQjwT5RK_WOkamhJLPfDKCi0d4-hxOuW73hVMAtD5NXKUxXy8KSdtI0GUd_-6RsxyZv6VvLEB_zBYhwnjbMQwUfjsMtWCSNRJpZtm2003__mC0)

### Delete Activity Diagram 
![Delete Activity Diagram](https://www.planttext.com/api/plantuml/png/R5BBRW8n3BpxAwmzWGHy0AfQGDj3fT8BXvxDnYnMimbDlAXyMm_zfFv23LiUg_OI9PcnPyR9z-VNB2ibRHiFaDyaO8gP0LJKCnObUrR6UQMo5ptW65VytdAe64kXEb5J052bCU7SDH8aQo8xGHM3fkYnE9SkAL3DgK3AE5y21ptsky05h6CR72MxMnsoSlCSwpE_su8ZfJLbixLgrutaB36KYnEZN03q3E3utcHmYkwKu2mpeD_Dank2uSOg5yRQKhxsp3qMUSKR31y_J0CGk-g-gCb9tdawl58A4kf1SLl9nye9pbErbJsZ18j9xg4O0djBzH9lTQuAvzbFiMOjMKbyt-4_p2xru8fr8pJ4HtDrONOyLupwGIRYHgZIiFsDPdVgqijvDnvtqxLdtaXgICtotxQOswhYd3UjzuTZpE00PhRQR_i1003__mC0)

