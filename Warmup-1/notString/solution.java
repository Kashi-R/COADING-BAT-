public String notString(String str) {
  if(str.startsWith("not"))
  return str;
  else 
  return ("not "+str);
}


//OR
//actual sloution
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
  }
  
  return "not " + str;
} 
