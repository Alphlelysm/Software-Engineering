# Class Inventory & Relationships

## Key Entities
- **User (abstract)** → **Student**, **Tutor**
- **Module**
- **Topic**, **Subscription**
- **LearningMaterial (abstract)** → **VideoMaterial**, **DocumentMaterial**, **InteractiveExercise**
- **Question**, **Response**
- **Quiz**, **QuizQuestion**, **QuizOption**, **QuizAttempt**
- **Conversation**, **Message**
- **Notification**

## Notes
- **Student** creates **Topic**, subscribes via **Subscription**.
- **Tutor** is associated with one or more **Module**(s) and responds to **Question** only for Topics in those Modules (enforced in services).
- **Topic** aggregates **LearningMaterial** and **Question**; **Question** aggregates **Response**.
- **Quiz** aggregates **QuizQuestion**, which aggregates **QuizOption**; students make **QuizAttempt**.
- **Conversation** aggregates **Message**; **Notification** is sent to **User**.