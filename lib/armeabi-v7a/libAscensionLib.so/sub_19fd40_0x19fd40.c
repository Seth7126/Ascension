// 函数: sub_19fd40
// 地址: 0x19fd40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result_5
void* result_6 = result_5
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
void* result_2 = result_5
int32_t r0 = *__stack_chk_guard
char* r6 = *arg1
int32_t r5 = arg1[1]
void* result

if (r6 == r5 || zx.d(*r6) != 0x53)
    result = nullptr
else
    *arg1 = &r6[1]
    int32_t r0_2
    
    if (r5 != &r6[1])
        r0_2 = zx.d(r6[1])
    else
        r0_2 = 0
    
    if (islower(r0_2) == 0)
        if (&r6[1] == r5 || zx.d(r6[1]) != 0x5f)
            result = nullptr
            result_2 = nullptr
            
            if (sub_19fb7c(arg1, &result_2) == 0)
                void* result_4 = result_2 + 1
                result_2 = result_4
                char* r1_4 = *arg1
                
                if (r1_4 == arg1[1] || zx.d(*r1_4) != 0x5f)
                    result = nullptr
                else
                    int32_t r2_4 = arg1[0x25]
                    int32_t r3_1 = arg1[0x26]
                    *arg1 = &r1_4[1]
                    
                    if (result_4 u>= (r3_1 - r2_4) s>> 2)
                        result = nullptr
                    else
                        result = *(r2_4 + (result_4 << 2))
        else
            void** r0_7 = arg1[0x25]
            int32_t r1_2 = arg1[0x26]
            *arg1 = &r6[2]
            
            if (r0_7 == r1_2)
                result = nullptr
            else
                result = *r0_7
    else if (r5 == &r6[1])
        result = nullptr
    else
        uint32_t r0_4 = zx.d(r6[1])
        result = nullptr
        void* result_3
        
        if (r0_4 - 0x61 u<= 8)
            switch (r0_4)
                case 0x61
                    *arg1 = &r6[2]
                    result_3 = nullptr
                    goto label_19fe48
                case 0x62
                    *arg1 = &r6[2]
                    result_3 = 1
                    goto label_19fe48
                case 0x64
                    *arg1 = &r6[2]
                    result_3 = 5
                    goto label_19fe48
                case 0x69
                    *arg1 = &r6[2]
                    result_3 = 3
                    goto label_19fe48
        else if (r0_4 == 0x6f)
            *arg1 = &r6[2]
            result_3 = 4
        label_19fe48:
            result_2 = result_3
            result = sub_1a4110(arg1, &result_2)
            void* result_1 = sub_1a0500(arg1, result, r6)
            result_2 = result_1
            
            if (result_1 != result)
                sub_19f9dc(&arg1[0x25], &result_2)
                result = result_1
        else if (r0_4 == 0x73)
            *arg1 = &r6[2]
            result_3 = 2
            goto label_19fe48

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
