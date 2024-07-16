#include <iostream>
using namespace std;

class Car{
    public:
    string name;
    int year;

    Car(string name, int year){
        this->name=name;
        this->year=year;
        cout<< "Car object is created" << endl;
    }

    ~Car(){
        cout<<"Car object is destroyed"<<endl;
    }

    void displayInfo(){
        cout <<"Name: " << name << " Year: " <<year <<endl;
    }
};

int main(){
    Car c1("BMW", 1990);
    c1.displayInfo();
}

