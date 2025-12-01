// 函数: _ZN14ascensionrules27BanishFromAdjacentCenterRowEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10bd78
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg7 + 4) == 0x1b && *(arg7 + 0x54) == 7)
    int32_t r12_1 = *(arg7 + 0x58)
    
    if (r12_1 u<= 6)
        ascensionrules::CreateStateProcessBanishFromCenterRow(arg3, arg4, r12_1, false, 0, false, 
            false, nullptr, arg6)
        return CStateMachine::PushListState(arg1) __tailcall

return arg7
