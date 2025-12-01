// 函数: _ZN14ascensionrules30AcquireOrDefeatCardInCenterRowEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10b338
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg7 + 4) != 0x1b || *(arg7 + 0x54) != 7)
    return arg7

ascensionrules::CreateStateProcessAcquireOrDefeatTopOfCenterRowStack(arg3, *(arg7 + 0x58), false)
return CStateMachine::PushListState(arg1) __tailcall
