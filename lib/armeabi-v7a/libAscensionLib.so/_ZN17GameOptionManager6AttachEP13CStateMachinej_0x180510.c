// 函数: _ZN17GameOptionManager6AttachEP13CStateMachinej
// 地址: 0x180510
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* __offset(CStateMachine, 0x20) result = arg1 + 0x20
int32_t r1 = *result
*arg1 = arg2
int32_t entry_r2
*(arg1 + 4) = entry_r2

if (r1 != entry_r2)
    result = arg1 + 0xc4
    
    if (*result != entry_r2)
        result = arg1 + 0x168
        
        if (*result != entry_r2)
            result = arg1 + 0x20c
            
            if (*result != entry_r2)
                result = arg1 + 0x2b0
                
                if (*result != entry_r2)
                    result = arg1 + 0x354
                    
                    if (*result != entry_r2)
                        result = nullptr

*(arg1 + 0x3fc) = result

if (arg2 == 0)
    return result

CStateMachine::SetOptionListBeginCallback(arg2, GameOptionManager::OptionListBeginListener)
CStateMachine::SetOptionListAddCallback(arg2, GameOptionManager::OptionListAddListener)
return CStateMachine::SetOptionListEndCallback(arg2, GameOptionManager::OptionListEndListener)
    __tailcall
