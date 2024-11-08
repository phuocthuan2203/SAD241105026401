# Animal Class Diagram

![Animal Diagram](https://www.planttext.com/api/plantuml/png/VP5DQiD038NtSmejMuelKBf8x3HWQBjnBw3E27lmM0eQfO7-tBrsaeO9XIuVUdnFJrfbGxNzb9pBOsHGoUISHKi4JSASAKC5QuuJ9jX4x1Kdv_0jcw8ty8lbT_pf0EuwqyWzlE14YspPODrJCMaaYIxwNMA0HxIRsulg4j5krj_EdSWRwQ-mjHA5GdVnuyYkHKPeywjYv9FXoAjHnmA_9VD3YM_G_iLlz_f4t0zspaXpHij1YWBF98UoWLUyX9plyl1L1JbmjRIvXvO7qcZ8dluOvdsk3Mv57ERl_000)

## Description:

This diagram illustrates the actions available to two types of users: **Administrator** and **Student**.

### Administrator:
- Can **login** to the system.
- Has access to the **AdminActions** panel, which includes the following functionalities:
  - **Manage Activities**: Allows the administrator to oversee and manage various student activities.
  - **Generate Report Card**: Enables the administrator to create report cards based on student performance in activities.

### Student:
- Can also **login** to the system.
- Has access to the **StudentActions** panel, which includes:
  - **Register For Activities**: Students can enrol in various activities available within the system.
  - **Submit Activity Evidence**: Allows students to submit proof or evidence of their participation in registered activities.

The layout is set from **left to right** for easy readability, with **Administrator** and **Student** placed on the left and their respective features on the right.

# Use-Case Diagram Using Package

![Use-Case Diagram Using Package](https://www.planttext.com/api/plantuml/png/RP11RW8n34NtFeMNiE0A5IC4RCfcvWGfCS7gZ5Cv7YHKSNUSWQf0crNql_Nyv6Mne3OEFK3vP47DXG1wEXXQHkLqD8oij3VE0b0_GL9FsCI1fPdYWj-0_cQx825vvUc9ZQdCCHJSDRTsIq8QZB2bhwo6gw1n6jYsAxWyiZiR8uczq5jAN8mKDrbVTxIR-v9k_1ZOVkepha_ig3rDKrspheicTKUvZ9CMYpUSlUV4Cl_JUENs_wHL6UwQJuJVpCDgzHHK0LYIH3_u5G00)

## Description:

This class diagram represents an inheritance hierarchy with a base class **Animal** and two derived classes, **Dog** and **Cat**.

### Animal (Abstract Class):

#### Properties:
- **Name (String)**: The name of the animal.
- **Age (Int)**: The age of the animal.
- **Color (String)**: The color of the animal.

#### Methods:
- **Eat()**: Represents the eating behavior.
- **Sleep()**: Represents the sleeping behavior.

### Dog (Derived from Animal):

#### Properties:
- **Breed (String)**: The breed of the dog.
- **Size (String)**: The size classification (e.g., small, medium, large).
- **IsTrained (Bool)**: Indicates if the dog is trained.

#### Methods:
- **Bark()**: Represents the barking behavior.
- **Fetch()**: Represents the dog's fetching behaviour.

### Cat (Derived from Animal):

#### Properties:
- **Breed (String)**: The breed of the cat.
- **FurLength (String)**: Indicates the length of the cat’s fur.
- **IsIndoor (Bool)**: Indicates if the cat is an indoor-only cat.

#### Methods:
- **Meow()**: Represents the meowing behavior.
- **Scratch()**: Represents the scratching behavior.
