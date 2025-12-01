// 函数: _ZN14ascensionrules22DrawCardsForTurnPlayerEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107b8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* result = *(arg2 + 0xb20)

if (result == 0)
    return result

ascensionrules::CreateStateProcessDrawCards(result, arg4, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
