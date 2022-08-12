#include <iostream>
#include <vector>

class Developer {
  public:
    std::string name;
    std::string surname;
    std::string location;
    int age;
    Developer() = default;
    void hello() {
      std::cout << "Hi, welcome to my GitHub profile!" << std::endl;
    }
};

int main() {
  Developer* me = new Developer;
  me->name = "Onur";
  me->surname = "Ravli";
  me->location = "Konya, Kayseri - Turkey";
  me->age = 21;
}