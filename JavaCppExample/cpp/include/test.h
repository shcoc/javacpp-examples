namespace test{
    int __declspec(dllexport) max(int a,int b);

    class __declspec(dllexport) Add
    {
    public:
        int add(int a,int b);

    };

}