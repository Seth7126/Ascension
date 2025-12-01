// 函数: sub_1a03ec
// 地址: 0x1a03ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
int32_t var_28 = r6
void** r4 = arg2
int32_t r0 = *__stack_chk_guard
void* r0_1 = *arg2

if (zx.d(*(r0_1 + 4)) == 0x24)
    int32_t r6_1 = *(r0_1 + 8)
    
    if (r6_1 - 2 u<= 3)
        void* r0_4 = sub_19fbde(&arg1[0x5c], 0xc)
        *r0_4 = &_vtable_for_(anonymous namespace)::ExpandedSpecialSubstitution{for `(anonymous namespace)::Node'}
        *(r0_4 + 4) = 0x1010123
        *(r0_4 + 8) = r6_1
        *r4 = r0_4

char* r1_1 = *arg1
int32_t r0_5 = arg1[1]
void* result

if (r1_1 != r0_5 && zx.d(*r1_1) == 0x43)
    void** r2_1 = &r1_1[1]
    *arg1 = r2_1
    
    if (r2_1 == r0_5)
        result = nullptr
    else
        int32_t r1_2
        
        if (zx.d(*r2_1) != 0x49)
            r1_2 = 0
        else
            r2_1 = &r1_1[2]
            r1_2 = 1
            *arg1 = r2_1
        
        if (r0_5 == r2_1)
            result = nullptr
        else
            int32_t r3_2 = zx.d(*r2_1) - 0x31
            result = nullptr
            
            if (r3_2 u<= 4 && r3_2 != 3)
                *arg1 = r2_1 + 1
                
                if (arg3 != 0)
                    *arg3 = 1
                
                void* r0_11
                
                if (r1_2 != 0)
                    r0_11 = sub_19f4bc(arg1, arg3, r2_1)
                
                if (r1_2 != 0 && r0_11 == 0)
                    result = nullptr
                else
                    var_28:3.b = 0
                    result = sub_1a3dd0(arg1, r4, &var_28:3)
else if (r0_5 == r1_1)
    result = nullptr
else
    result = nullptr
    
    if (r0_5 - r1_1 != 1 && zx.d(*r1_1) == 0x44)
        int32_t r2_4 = zx.d(r1_1[1]) - 0x30
        result = nullptr
        
        if (r2_4 u<= 5 && (1 << r2_4 & 0x27) != 0)
            *arg1 = &r1_1[2]
            
            if (arg3 != 0)
                *arg3 = 1
            
            var_28:2.b = 1
            result = sub_1a3dd0(arg1, r4, &var_28:2)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
