// 函数: sub_d2860
// 地址: 0xd2860
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
unimplemented  {vpush {d8, d9}}
int128_t q4

if (arg1 u> 6)
    q4.q = 0
else
    q4:8.q = arg3
    unimplemented  {vmov d8, r2, r3}
    
    switch (arg1)
        case 0
            q4.q = q4.q f+ q4:8.q
        case 1
            q4.q = q4.q f- q4:8.q
        case 2
            q4.q = q4.q f* q4:8.q
        case 3
            q4.q = q4.q f/ q4:8.q
        case 4
            int128_t q0
            q0.q = q4.q f/ q4:8.q
            unimplemented  {vmov r0, r1, d0}
            floor(arg2)
            unimplemented  {vmov d0, r0, r1}
            unimplemented  {vmls.f64 d8, d0, d9}
        case 5
            unimplemented  {vmov r12, lr, d9}
            unimplemented  {vpop {d8, d9}}
            return pow() __tailcall
        case 6
            unimplemented  {vneg.f64 d8, d8}
unimplemented  {vmov r0, r1, d8}
unimplemented  {vpop {d8, d9}}
