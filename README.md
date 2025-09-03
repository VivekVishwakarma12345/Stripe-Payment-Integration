# 💳 Stripe Payment Service Provider (PSP) Integration System
**Tech Stack:** 
Programming Languages: Java
Frameworks: Spring Boot, Spring AI,  Spring Boot JDBC
Microservices Architecture
AI: Spring AI, OpenAI LLM, Llama LLM, Vibe Coding(Github Copilot)
RESTful APIs: JSON, CURL, Postman, Swagger
Databases: MySQL (RDS)
Version Control Systems: Git, BitBucket, SourceTree
Build Tools: Maven
Application Server: Tomcat
IDEs: Intellij IDEA, DBEaver
Async technology: ActiveMQ
Agile Methodologies: Scrum, Agile Development
Project management tool: Jira
Logging, Debugging & Troubleshooting: Intellij IDEA, Slf4J with Logback
Performance Tuning | Code Review | Data Structures | Algorithms
Other tools: Jackson, Lombok, Sonar Lint


## 📌 Overview
Contributed to building a secure and scalable Stripe Payment Integration System using Java Spring Boot in a microservices 
architecture on AWS. Participated in implementing payment processing, payment status management, Stripe PSP REST API 
integration, notification handling, security enhancements, and error management. Explored Spring AI with OpenAI LLM and 
integrated ActiveMQ for asynchronous messaging. Followed RESTful standards, applied design patterns, and strengthened 
debugging and problem-solving skills. 
This project is a **Stripe Payment Service Provider Integration System** built using **Core Java** and **Spring Boot**.  
The main goal is to simulate how real-world **payment processing systems (PSPs)** like **Stripe** or **Razorpay** work in production environments.

It provides **secure APIs for user/merchant onboarding, payment processing, webhook handling, refunds, disputes, and reporting.**

## ✨ Features

### 🔑 User & Merchant Management
- Secure **user & merchant registration/login** (Spring Security).
- Merchants can store business details such as **name, email, and Stripe account ID**.
- **Role-based access control (RBAC):**
    - Users → View their own payments.
    - Merchants → Manage their payments & customers.
    - Admins → Full system visibility.

### 💳 Payment Flow (Stripe Integration)
- Supports **Payment Intents API** (Stripe).
- Multiple payment methods: **Cards, UPI, Google Pay, Apple Pay, Wallets**.
- Payment statuses: **Pending → Success → Failed → Refunded → Disputed**.
- Sensitive card details are **never stored**; only masked details are shown.

### 🔔 Real-time Webhooks
- Listens to **Stripe webhook events** like:
    - `payment_intent.succeeded`
    - `payment_intent.payment_failed`
    - `charge.refunded`
    - `charge.dispute.created`
- Updates transaction records in **real time**.

### 📑 Refund & Dispute Management - UpComming 
- Merchants can trigger **refunds** via the system.
- Disputes are automatically logged for **admin review**.

### 📊 Transaction Dashboard - Upcomming 
- Filter transactions by **date, status, amount, or currency**.
- Export history in **CSV or PDF format**.

### 🔄 Reconciliation & Analytics - Upcomming 
- **Automated reconciliation** with Stripe to ensure DB matches Stripe records.
- **Analytics dashboard** with insights like:
    - Total revenue
    - Number of refunds
    - Dispute statistics

### 📩 Notifications - Upcomming 
- **Email & SMS alerts** for:
    - Payment success/failure
    - Refunds
    - Disputes

## 🛠️ Tech Stack

- **Backend:** Core Java 17, Spring Boot
- **Database:** MySQL (transactions, users, merchants)
- **Payment Gateway:** Stripe API (Payment Intents + Webhooks)
- **Security:** Spring Security, Role-based Access Control
- **Build Tool:** Maven
- **Other Tools:** Lombok, Postman (API testing)
- **Optional:** Twilio (SMS), SendGrid/Mailgun (Email notifications)

## ⚙️ Project Setup

### 1. Clone the repository
    ```bash
    git clone https://github.com/your-username/stripe-psp-system.git
    cd stripe-psp-system

2. Configure Environment Variables
    Create a file named .env or use IntelliJ Run Configurations:
    properties
    Copy
    Edit
    STRIPE_SECRET_KEY=sk_test_xxxxxxxxxxxxx
    STRIPE_PUBLISHABLE_KEY=pk_test_xxxxxxxxx
    DB_URL=jdbc:mysql://localhost:3306/stripe_psp
    DB_USERNAME=root
    DB_PASSWORD=yourpassword
    MAIL_API_KEY=your-email-service-key
    SMS_API_KEY=your-sms-service-key

3. Setup Database (MySQL)
    sql
    Copy
    Edit
    CREATE DATABASE stripe_psp;

4. Run the Application
bash
Copy
Edit
mvn spring-boot:run
The application will start at: GET http://localhost:8083/payment/health_check

Payment APIs
    POST : For Create Stripe Session
    👉 http://localhost:8083/payment
    POST : For Update Stripe Session
    👉 http://localhost:8083/payment/{"id"}
    GET : For Retieve Stripe Session
    👉 http://localhost:8083/payment/{"id"}
    GET : For Expire Stripe Session
    👉 http://localhost:8083/payment/expire/{"id"}

📊 Demo Flow
Merchant registers their account.
Merchant creates a payment intent via API.
User completes payment using Stripe Checkout.
Stripe sends webhook events → Application updates transaction status.
Merchant can view dashboard, trigger refunds, or handle disputes.
Admin can monitor everything, view analytics & reconcile records.

🔐 Security & Compliance
✅ No sensitive card data stored locally.
✅ Stripe keys secured in environment variables.
✅ Only masked card details displayed.
✅ Role-based access (User/Merchant/Admin).

📌 Upcoming Improvements (Future Roadmap)
"The project is not yet fully completed, as I am continuously working on it to enhance its features and functionalities. I am focused on making improvements, optimizing performance, and adding more capabilities to ensure it becomes a more robust and effective solution."
Date | Project Start : 04/08/2025 - Project Ends : 28/09/2025

🚀 Project Learnings
Hands-on experience integrating third-party PSP (Stripe).
Building production-like payment workflows (refunds, disputes, reconciliation).
Working with Spring Boot Webhooks.
Designing secure, real-time fintech systems.

👤 Author
Vivek Vishwakarma
Java Full Stack Developer
[LinkedIn](https://www.linkedin.com/in/vivek-vishwakarma-) | [GitHub](https://github.com/VivekVishwakarma12345) | [BitBucket](https://bitbucket.org/spspismain/stripe-psp-integration/src/main/)
