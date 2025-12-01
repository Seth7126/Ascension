// 函数: _ZNSt6__ndk118__insertion_sort_3IRPFbPKN4core13CCardInstanceES4_EPPS2_EEvT0_SA_T_
// 地址: 0x199d90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = (*arg3)(arg1[1], *arg1)
void* result_2 = &arg1[2]
int32_t r0_3 = (*arg3)(*result_2, arg1[1])

if (r0_1 != 0)
    core::CCardInstance* r1_2 = *arg1
    
    if (r0_3 == 0)
        int32_t r0_8 = arg1[2]
        *arg1 = arg1[1]
        arg1[1] = r1_2
        
        if ((*arg3)(r0_8) != 0)
            int32_t r0_10 = arg1[1]
            arg1[1] = arg1[2]
            arg1[2] = r0_10
    else
        *arg1 = arg1[2]
        arg1[2] = r1_2
else if (r0_3 != 0)
    core::CCardInstance* r1_3 = *arg1
    int32_t r2_2 = arg1[1]
    int32_t r0_5 = arg1[2]
    arg1[1] = r0_5
    arg1[2] = r2_2
    
    if ((*arg3)(r0_5, r1_3) != 0)
        int32_t* temp0_3 = arg1
        int32_t r0_7 = *temp0_3
        *arg1 = temp0_3[1]
        arg1[1] = r0_7

void* result = &arg1[3]

if (result != arg2)
    int32_t r6_1 = 0
    
    do
        void* result_1 = result
        
        if ((*arg3)(*result, *result_2) != 0)
            int32_t r7_1 = *result_1
            int32_t r5_1 = r6_1
            void* r0_17
            
            while (true)
                void* r0_13 = arg1 + r5_1
                *(r0_13 + 0xc) = *(r0_13 + 8)
                
                if (r5_1 == 0xfffffff8)
                    r0_17 = arg1
                    break
                
                r5_1 -= 4
                
                if ((*arg3)(r7_1, *(r0_13 + 4)) == 0)
                    r0_17 = arg1 + r5_1 + 0xc
                    break
            
            *r0_17 = r7_1
        
        result = result_1 + 4
        r6_1 += 4
        result_2 = result_1
    while (result != arg2)

return result
