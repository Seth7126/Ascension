// 函数: sub_19f9dc
// 地址: 0x19f9dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t __saved_r7
int32_t* var_28 = &__saved_r7
void* result = arg1[1]

if (result == arg1[2])
    void* r9_1 = *arg1
    int32_t r5_1 = result - r9_1
    void* r6_1
    
    if (&arg1[3] == r9_1)
        r6_1 = malloc(r5_1 << 1)
        
        if (r5_1 != 0)
            __aeabi_memmove4(r6_1, r9_1, r5_1)
        
        *arg1 = r6_1
    else
        void* r0_1 = realloc(r9_1, r5_1 << 1)
        r6_1 = r0_1
        *arg1 = r0_1
    
    result = r6_1 + (r5_1 s>> 2 << 2)
    arg1[1] = result
    arg1[2] = r6_1 + (r5_1 s>> 1 << 2)

int32_t r1_6 = *arg2
arg1[1] = result + 4
*result = r1_6
return result
