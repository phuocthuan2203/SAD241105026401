# Select Payment Method

## 1. Boundary Classes

### 1.1 PaymentMethodSelectionUI

- **Interface Description:**
    - Allows the Employee to select a payment method.
    - Collects input from the Employee.
    - Displays messages and requests for additional information.

## 2. Control Classes

### 2.1 PaymentMethodController

- **Responsibilities:**
    - Manages the workflow of selecting a payment method.
    - Validates Employee information.
    - Determines if additional information is required based on the payment method.
    - Updates the Employee's payment method in the system.

## 3. Entity Classes

### 3.1 Employee

- **Description:**
    - Represents the Employee in the system.
    - Contains Employee details and current payment method.

### 3.2 PaymentMethod

- **Description:**
    - Abstract class representing a generic payment method.

### 3.3 PickUpPaymentMethod

- **Description:**
    - Inherits from PaymentMethod.
    - Represents the "pick up" payment method.

### 3.4 MailPaymentMethod

- **Description:**
    - Inherits from PaymentMethod.
    - Contains an Address.
    - Represents the "mail" payment method.

### 3.5 DirectDepositPaymentMethod

- **Description:**
    - Inherits from PaymentMethod.
    - Contains BankAccount details.
    - Represents the "direct deposit" payment method.

### 3.6 Address

- **Description:**
    - Represents a mailing address.
    - Used by MailPaymentMethod.

### 3.7 BankAccount

- **Description:**
    - Represents bank account details.
    - Used by DirectDepositPaymentMethod.

## 4. Responsibilities for Each Analysis Class

### 4. Boundary Classes

#### 4.1 PaymentMethodSelectionUI

- **Responsibilities:**
    - Present payment method options to the Employee.
    - Collect the Employee's selection and any additional required information.
    - Display error messages and confirmations.

### 5. Control Classes

#### 5.1 PaymentMethodController

- **Responsibilities:**
    - Coordinate the payment method selection process.
    - Validate the Employee's existence in the system.
    - Determine if additional information is needed based on the selected payment method.
    - Update the Employee's payment method in the system.

### 6. Entity Classes

#### 6.1 Employee

- **Responsibilities:**
    - Store and provide access to Employee details, including the current payment method.

#### 6.2 PaymentMethod (Abstract Class)

- **Responsibilities:**
    - Define a template for specific payment methods.

#### 6.3 PickUpPaymentMethod

- **Responsibilities:**
    - Represent the "pick up" payment method with no additional information required.

#### 6.4 MailPaymentMethod

- **Responsibilities:**
    - Store mailing address information.
    - Represent the "mail" payment method.

#### 6.5 DirectDepositPaymentMethod

- **Responsibilities:**
    - Store bank name and account number.
    - Represent the "direct deposit" payment method.

#### 6.6 Address

- **Responsibilities:**
    - Store address details for mailing purposes.

#### 6.7 BankAccount

- **Responsibilities:**
    - Store bank account details for direct deposit.

## 7. Reasons for Multiple Entities

### 7.1 Clarity and Maintainability

#### 7.1.1 Separation of Concerns

- Each class represents a specific concept or piece of data, making the system easier to understand and maintain.

#### 7.1.2 Single Responsibility Principle

- Each class has a single responsibility, which reduces complexity and improves code quality.

### 7.2 Extensibility and Reusability

#### 7.2.1 Modularity

- By having separate classes, it's easier to extend or modify parts of the system without affecting others.

#### 7.2.2 Reusability

- Classes like **Address** and **BankAccount** can be reused in other parts of the system that require address or bank account information.

## 8. Entities Explanation

### 8.1 Employee

- Central entity representing an employee, containing personal and payment method information.

### 8.2 PaymentMethod (Abstract)

- Defines a common interface for all payment methods.

### 8.3 PickUpPaymentMethod, MailPaymentMethod, DirectDepositPaymentMethod

- Specific implementations of **PaymentMethod**, each with unique attributes and behaviors.

### 8.4 Address

- Encapsulates address details, used by **MailPaymentMethod**.

### 8.5 BankAccount

- Encapsulates bank account details, used by **DirectDepositPaymentMethod**.

## Sequence Diagram
![PlantUML Diagram 1](https://www.planttext.com/api/plantuml/png/fPHDRi8m48NtFiM8FHV8eg8gL691Yq0Sm2G37ScnKtk2bDlNpWyKaa08NaIoFVFf-Vd5CyVISfugmSGAOR95XJ73MXOfQeOLyez9O8k_EUeOOKxoQ6Kw4KB6R2miqaoP0b68lSbr8ctHj5QT5OwCtYr5R3HRewuBFgf5XLRuDUBYZ5oKKo6QEKpVUjaHB3KnISQsyhf8YBxc5lYYAO9jy6SezD8OcDS7YM23R0bFUDxmeW_6EwduilHb63w3bGByk4Fljs9EBbFI6scjlw4LEYUFsCRTED0eYEg-QPScLEwV_1TrRaAeNClSxomKk2S4DmU-0neMeixmFnJIdvrydr8BL_B2dT_83NQGHGVlIKA1BbKL4AZ7IoOFWlOw_8WopDwrDITAS9IMHoPtCL7NRZ_na-wofFsAZC-uhpkGJMliY4pN05c-DkM1PluR7km_)

## Class Diagram with their behaviors
![PlantUML Diagram 2](https://www.planttext.com/api/plantuml/png/bLNBRjim4BphAnQwf2rW1BqQXf7d8OS4HOny04sk7S8KoP9KKRVDltT9lMKfJYv-K3FapEuiTUK3Sw4iLEOFKblcM06MyGFRuoOS5O937fZUAyooUXto6rDgmTmnXzNgkNc-NiFV380hvZtyOCS2TNZ4y6h41XM1fD4l3ma2HDlMMwpNQU7o4gn3JnGwFL6XI5mmDZBzbwyDZXiLjuFxmYfpHBpmu9i3W6a1J0WP_p05KkzCnnJIMyMEWCuPH_jxJsvyud2ZTz8Lh3lhBNlhERurEZYZFcYuHYjqhLzUBNLskJ5EICq2ZXrtRgmpd5Hs3dun9KMaDEO1VqiVK7FisSI0hf0QnvK0ZIXGTCZI3ZQZIWwbJ1JYNWSPtcbyAwmnZedG-VR1EApwnAEvZa6wcLGzjmNJyKnUEdSQZ1gs02cMi0bEwdsze5c1eoNRxyvosAnaaJxOrWV7A5WJ3Prr8t0N2nsGJCHIxYXOtYANEyb7WfjOTP6H_F1YFtQEmsOySaiqwbm-NG_2QZDkV1riskLdAHsAiP97glkdTHH4cXTHjJbYg0jHZukzxebf-rS_My9rzMCexKx62-WEhV4oV5gZI6pgKgAVKxjb-f3IqyIJxgW0kYosw5gv4NHTFLh2JVTdABlsScuAQbIT_9IUkcJjUHHAn33ACwVDHaj_fBqreX_ydfoUpZEIKWqQwyE9hBm_dKvN3NzAXHe880aNy8ogkbTVfVNPx9jXiLZFtQBPtEqQEStzaMNjJP9_py4i5kbxEEl3dM3rZr0JSpW5EncIAT1yNBFiTCg-4QD9_Jj1Zx1-qh8hr2A-ily3)
