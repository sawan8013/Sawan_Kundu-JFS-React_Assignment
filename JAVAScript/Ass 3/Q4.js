var fullName = {
    firstName: "Ananya",
    lastName: "Biswas",
  };
  
  console.log(
    "Before initializing data name is " +
      fullName.firstName + " " + fullName.lastName
  );
  
  fullName.lastName = "Kundu";
  console.log(
    "After updating data name is " +
      fullName.firstName +" " +fullName.lastName
  );