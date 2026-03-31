# Système de Gestion de Réservation de Salles de Conférence

## Vue d'ensemble
Application Desktop JavaFX complète pour la gestion centralisée des réservations de salles de conférence avec interface conviviale et outils d'administration.

## Fonctionnalités principales
- 📅 Calendrier interactif des réservations
- 🚪 Gestion des salles de conférence
- 🎛️ Gestion des équipements
- 👥 Gestion des utilisateurs avec rôles
- 📧 Notifications automatiques
- 📊 Rapports et statistiques
- 🔐 Authentification sécurisée

## Technologies utilisées
- **Frontend**: JavaFX 21
- **Backend**: Java
- **Database**: MySQL 8.0
- **Build**: Maven
- **Architecture**: MVC + DAO Pattern

## Structure du projet
```
conference-room-reservation/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/com/conferenceroom/
│   │   │   ├── controllers/
│   │   │   ├── models/
│   │   │   ├── dao/
│   │   │   ├── services/
│   │   │   ├── utils/
│   │   │   └── Main.java
│   │   └── resources/
│   │       ├── fxml/
│   │       ├── css/
│   │       └── config.properties
│   └── test/java/
└── database/
    └── schema.sql
```

## Installation

### Prérequis
- JDK 17+
- MySQL 8.0+
- Maven 3.6+

### Étapes d'installation
1. Cloner le dépôt
2. Créer la base de données MySQL
3. Configurer les paramètres de connexion
4. Compiler avec Maven
5. Exécuter l'application

## Utilisation

### Rôles utilisateurs
- **Admin**: Accès complet à l'administration
- **Manager**: Gestion des réservations et équipements
- **User**: Réservation de salles

## Licence
MIT License