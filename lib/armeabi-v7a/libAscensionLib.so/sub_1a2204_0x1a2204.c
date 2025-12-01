// 函数: sub_1a2204
// 地址: 0x1a2204
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result_5
void* result_7 = result_5
void* result_13
void* result_14 = result_13
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
void* result_1 = result_5
void* result_6 = result_13
int32_t var_30 = r4
int32_t r0 = *__stack_chk_guard
result_1 = nullptr
void* result
char* r0_22

if (sub_19e5e0(arg1, "srN", 0x1d0083) == 0)
    int32_t r0_13 = sub_19e5e0(arg1, "gs", 0x1cfec2)
    
    if (sub_19e5e0(arg1, "sr", 0x1d0086) == 0)
        result = sub_1a3070(arg1)
        result_1 = result
        
        if (result != 0 && r0_13 == 1)
            result = sub_1a317c(arg1, &result_1)
            result_1 = result
    else
        char* r0_16 = *arg1
        int32_t r1_6 = arg1[1]
        
        if (r1_6 != r0_16 && zx.d(*r0_16) - 0x30 u<= 9)
            void* result_8 = nullptr
            
            while (true)
                void* result_3 = sub_1a2fd4(arg1)
                result_6 = result_3
                
                if (result_3 == 0)
                    goto label_1a2370_2
                
                if (result_8 != 0)
                    result_3 = sub_1a3040(arg1, &result_1, &result_6)
                else if (r0_13 != 0)
                    result_3 = sub_1a317c(arg1, &result_6)
                
                result_8 = result_3
                result_1 = result_3
                r0_22 = *arg1
                
                if (r0_22 != arg1[1])
                    if (zx.d(*r0_22) == 0x45)
                        break
            
            *arg1 = &r0_22[1]
            goto label_1a235a
        
        void* result_4 = sub_1a2f44(arg1, r1_6)
        result_1 = result_4
        
        if (result_4 == 0)
        labelid_4:
            result = nullptr
        else
            char* r0_27 = *arg1
            
            if (arg1[1] == r0_27 || zx.d(*r0_27) != 0x49)
                goto label_1a235a
            
            void* result_11 = sub_19fe78(arg1, 0)
            result_6 = result_11
            
            if (result_11 == 0)
            labelid_4:
                result = nullptr
            else
                result_1 = sub_1a0150(arg1, &result_1, &result_6)
            label_1a235a:
                void* result_12 = sub_1a3070(arg1)
                result_6 = result_12
                
                if (result_12 == 0)
                label_1a2370:
                    result = nullptr
                else
                    result = sub_1a3040(arg1, &result_1, &result_6)
else
    void* result_2 = sub_1a2f44(arg1)
    result_1 = result_2
    
    if (result_2 == 0)
    label_1a2370_1:
        result = nullptr
    else
        char* r0_4 = *arg1
        
        if (arg1[1] == r0_4 || zx.d(*r0_4) != 0x49)
            goto label_1a2278
        
        void* result_9 = sub_19fe78(arg1, 0)
        result_6 = result_9
        
        if (result_9 != 0)
            result_1 = sub_1a0150(arg1, &result_1, &result_6)
        label_1a2278:
            
            while (true)
                r0_22 = *arg1
                
                if (r0_22 != arg1[1] && zx.d(*r0_22) == 0x45)
                    break
                
                void* result_10 = sub_1a2fd4(arg1)
                result_6 = result_10
                
                if (result_10 == 0)
                    goto label_1a2370_2
                
                result_1 = sub_1a3040(arg1, &result_1, &result_6)
            
            *arg1 = &r0_22[1]
            goto label_1a235a
        
    label_1a2370_2:
        result = nullptr

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
