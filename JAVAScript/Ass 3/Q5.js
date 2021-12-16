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

  console.log(
    "Accessing the middle name Before assigning " + fullName.middleName
  );
  
  fullName.middleName = "Biswas";
  console.log("Accessing the middle name After assigning " + fullName.middleName);