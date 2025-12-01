// 函数: sub_d7d88
// 地址: 0xd7d88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r9 = arg2
int32_t* r8 = arg1
void* r6 = arg1[3]
int32_t result = sub_cb2bc(arg1, 0xfffffffb)
int32_t r2 = *(r6 + 0x20)

if (r2 s< r9)
    if (r9 + 1 u>= 0x40000000)
        sub_d14b4(r8)
        noreturn
    
    result, r8, r9 = sub_d14cc(r8, *(r6 + 0x18), r2 << 2, r9 << 2)
    r2 = *(r6 + 0x20)
    *(r6 + 0x18) = result
    
    if (r2 s< r9)
        *(result + (r2 << 2)) = 0
        result = r2 + 1
        
        if (result != r9)
            do
                *(*(r6 + 0x18) + (result << 2)) = 0
                result += 1
            while (r9 != result)
    
    goto label_d7e0c

label_d7e0c:

if (r2 s>= 1)
    result = r9 - 1
    int32_t r3_3 = 0
    
    do
        int32_t r7_1 = *(r6 + 0x18)
        int32_t* i_1 = *(r7_1 + (r3_3 << 2))
        *(r7_1 + (r3_3 << 2)) = 0
        
        if (i_1 != 0)
            int32_t* i
            
            do
                int32_t r7_3 = i_1[2] & result
                i = *i_1
                *i_1 = *(*(r6 + 0x18) + (r7_3 << 2))
                *(*(r6 + 0x18) + (r7_3 << 2)) = i_1
                *(i_1 + 5) &= 0xbf
                i_1 = i
            while (i != 0)
            r2 = *(r6 + 0x20)
        
        r3_3 += 1
    while (r3_3 s< r2)

if (r2 s> r9)
    if (r9 + 1 u>= 0x40000000)
        sub_d14b4(r8)
        noreturn
    
    result, r9 = sub_d14cc(r8, *(r6 + 0x18), r2 << 2, r9 << 2)
    *(r6 + 0x18) = result

*(r6 + 0x20) = r9
return result
