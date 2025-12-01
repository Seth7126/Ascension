// 函数: _ZN14ascensionrules34BanishAllOtherCenterRowWithPortalsEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x115da4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg7 + 4) != 0x11)
    return arg7

int32_t r1_1 = *(arg7 + 0x54)

if (r1_1 u> 6)
    return arg7

ascensionrules::CreateStateBanishAllOtherCenterRowWithPortals(arg3, r1_1)
return CStateMachine::PushListState(arg1) __tailcall
