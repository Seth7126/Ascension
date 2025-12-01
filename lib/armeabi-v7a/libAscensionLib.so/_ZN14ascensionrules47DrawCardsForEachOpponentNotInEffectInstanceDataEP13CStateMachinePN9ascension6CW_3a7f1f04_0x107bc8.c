// 函数: _ZN14ascensionrules47DrawCardsForEachOpponentNotInEffectInstanceDataEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107bc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = not.d(zx.d(*(arg6 + arg4 + 4))) + ((*(arg2 + 0x1c) - *(arg2 + 0x18)) s>> 2)
int32_t r1_2 = result * arg4

if (r1_2 s< 1)
    return result

ascensionrules::CreateStateProcessDrawCards(arg3, r1_2, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
