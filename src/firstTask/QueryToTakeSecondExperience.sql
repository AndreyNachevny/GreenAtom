SELECT surname from "Employees" where experience IN
                                      (Select MAX(experience) from "Employees" WHERE experience !=
                                              (SELECT MAX(experience) from "Employees"))