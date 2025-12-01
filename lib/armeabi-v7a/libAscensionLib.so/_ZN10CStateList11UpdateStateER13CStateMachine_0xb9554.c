// 函数: _ZN10CStateList11UpdateStateER13CStateMachine
// 地址: 0xb9554
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r0 = *(arg1 + 0x30)
int32_t** entry_r1

if (r0 == 0)
    int32_t* result = *entry_r1
    
    if (result != 0 && result == arg1)
        (*(*arg1 + 0x10))(arg1, entry_r1)
        int32_t* r2_4 = *entry_r1
        result = r2_4[1]
        r2_4[1] = 0
        
        if (result != 0)
            result[2] = 0
        
        *entry_r1 = result
    
    return result

int32_t r2_1 = r0[6]
*(arg1 + 0x30) = r2_1

if (r2_1 == 0)
    *(arg1 + 0x34) = 0

r0[6] = 0
int32_t* r1_1 = *entry_r1

if (r1_1 != 0)
    r1_1[2] = r0
    r0[1] = r1_1

*entry_r1 = r0
jump(*(*r0 + 8))
