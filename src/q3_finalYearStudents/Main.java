// package q3_finalYearStudents;

// class Main {
//     using namespace std;

//     // format of data stored in file=>
//     // name tenth_marks twelveth_marks number_of_arrears first_year_marks
//     // second_year_marks third_year_marks
// string eligible(string str)
// {
// vector<string> v;

// stringstream ss(str);
// while (ss.good()) {
// string substr;
// getline(ss, substr,' ');
// v.push_back(substr);
// }
// int ten=stoi(v[1]);
// int twelve=stoi(v[2]);
// int arrear=stoi(v[3]);
// int yr1=stoi(v[4]);
// int yr2=stoi(v[5]);
// int yr3=stoi(v[6]);
// int avg3yr=(yr1+yr2+yr3)/3;
// if(ten<60 || twelve<60 || arrear>2 || avg3yr <65 ){
// return "0";
// }
// else{
// return v[0];
// }

// }

// public static void main(String args[])
// fstream newfile;
// newfile.open("STUDENT.txt",ios::in);
// if (newfile.is_open())
// {
// string tp;
// while(getline(newfile, tp))
// {
// // cout<<"tp"<<tp<<endl;
// string temp;
// temp=tp;
// string ans=eligible(temp);
// if(ans!="0"){
// cout<<ans<<endl;
// }
// }
// newfile.close();
// }

// }
// }