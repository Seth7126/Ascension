// 函数: sub_d0344
// 地址: 0xd0344
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg1 + 0x3c)
char r4 = arg2
int32_t r1 = r6[1]
int32_t r2 = r6[2]
int32_t r3 = r1 + 1
char* result

if (r3 u<= r2)
    result = *r6
else
    if (r2 u>= 0x7ffffffe)
        int64_t* pc
        sub_d14b4(sub_ce79c(arg1, "lexical element too long", nullptr, pc, r3))
        noreturn
    
    int32_t* r0 = *(arg1 + 0x34)
    
    if (0xfffffffe == r2 << 1)
        sub_d14b4(r0)
        noreturn
    
    int32_t r5_2
    result, r4, r5_2 = sub_d14cc(r0, *r6, r2, r2 << 1)
    r1 = r6[1]
    *r6 = result
    r3 = r1 + 1
    r6[2] = r5_2

r6[1] = r3
result[r1] = r4
return result
