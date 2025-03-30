# MVC-Pattern

📌 **MVC-Pattern** -  repozytorium demonstracyjne pokazujące, jak działa wzorzec projektowy **Model-View-Controller (MVC)** w języku **Java**. Ten wzorzec jest szeroko stosowany w tworzeniu aplikacji, 
ponieważ pozwala na **lepszą organizację kodu** poprzez rozdzielenie warstw odpowiedzialnych za logikę biznesową, interfejs użytkownika i kontrolę przepływu danych.

## 🔍 Czym jest wzorzec MVC?
Wzorzec **MVC (Model-View-Controller)** dzieli aplikację na trzy główne komponenty:

- **Model** 🗂️ – Reprezentuje dane oraz logikę aplikacji. Przechowuje informacje i zarządza nimi.
- **View** 👀 – Odpowiada za prezentację danych użytkownikowi. Pobiera dane z modelu i wyświetla je w odpowiedni sposób.
- **Controller** 🎛️ – Kontroluje przepływ informacji między modelem a widokiem. Przyjmuje dane od użytkownika i przekazuje je do modelu, a następnie aktualizuje widok.

Taki podział ułatwia rozwój i utrzymanie aplikacji, ponieważ poszczególne warstwy są od siebie oddzielone i mogą być rozwijane niezależnie.

## 📂 Struktura katalogów

### 📁 `src/`
Zawiera cztery kluczowe pliki implementujące wzorzec **MVC**:

- `StudentModel.java` – Model, czyli klasa przechowująca dane studenta
- `StudentView.java` – Widok, odpowiadający za prezentację informacji
- `StudentController.java` – Kontroler, który zarządza przepływem danych
- `Main.java` – Główna klasa uruchamiająca aplikację i łącząca komponenty MVC

### 📁 `mvc-test.iml` i `.gitignore`
Dodatkowe pliki dla projektu.

## 💻 Implementacja
W tej aplikacji mamy prostą symulację zarządzania danymi studenta:
1. **Model (`StudentModel`)** przechowuje informacje o studencie (imię, nazwisko, numer albumu).
2. **Widok (`StudentView`)** umożliwia wyświetlanie danych użytkownikowi.
3. **Kontroler (`StudentController`)** pośredniczy między modelem a widokiem – umożliwia ustawienie i pobranie danych.
4. **Klasa `Main`** tworzy obiekty modelu, widoku i kontrolera, a następnie ustawia dane i je wyświetla.

## 🚀 Jak uruchomić?
1. **Sklonuj repozytorium:**
   ```bash
   git clone <adres_repo>
   ```
2. **Otwórz projekt w IntelliJ IDEA / Eclipse / innym IDE**
3. **Uruchom `Main.java`** i zobacz wynik działania programu!

## ❗ Podsumowanie
Wzorzec **MVC** jest moim zdaniem jednym z najważniejszych wzorców projektowych. Umożliwia dobre zorganizowanie kodu oraz dobrą kontrole nad aplikacją poprzez oddzielanie od siebie danych i rozbijanie ich, co w dalszej mierze ułatwia rozbudowę aplikacji. Tutaj znajduje się prosty przykład ilustrujący działanie **MVC** w **Javie**, który może być podstawą do dalszej nauki i eksperymentowania. 😊

