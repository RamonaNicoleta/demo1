// language-switch.js

document.addEventListener("DOMContentLoaded", function () {
   // Default language
   let currentLanguage = "en";

   // Language data object
   const languageData = {
      "en": {
         "outstanding": "Outstanding",
         "coffee": "Coffee Shop",
         "there": "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour.",
         "learnMore": "Learn More"
      },
      "ro": {
         "outstanding": "Remarcabil",
         "coffee": "Cafenea",
         "there": "Există multe variante ale pasajelor Lorem Ipsum disponibile, dar majoritatea au suferit modificări într-o formă sau alta, prin umorul injectat.",
         "learnMore": "Află mai mult"
      },
      "france": {
         "outstanding": "Exceptionnel",
         "coffee": "Café",
         "there": "Il existe de nombreuses variations de passages du Lorem Ipsum disponibles, mais la majorité ont subi une altération sous une forme ou une autre, par de l'humour injecté.",
         "learnMore": "En savoir plus"
      }
   };

   // Function to set language
   function setLanguage(language) {
      currentLanguage = language;
      const data = languageData[language];

      // Update content based on language
      document.getElementById("outstanding-text").innerText = data["outstanding"];
      document.getElementById("coffee-text").innerText = data["coffee"];
      document.getElementById("there-text").innerText = data["there"];
      document.getElementById("learn-more").innerText = data["learnMore"];

      // Update other elements as needed
   }

   // Initially set language based on user preference or default to "en"
   setLanguage(currentLanguage);

   // Example: Change language to "ro" on button click
   document.getElementById("change-language-ro").addEventListener("click", function () {
      setLanguage("ro");
   });

   // Example: Change language to "france" on button click
   document.getElementById("change-language-france").addEventListener("click", function () {
      setLanguage("france");
   });

   // Add more buttons or methods as needed for language selection
});
