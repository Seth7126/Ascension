// 函数: _ZN14ascensionrules28AcquireTopOfCenterDeckIfHeroEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112b98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r0 = *(arg2 + 0xa3c)

if (*(r0 + 0x18) s< 1)
    return r0

int32_t r0_3 = *(*(core::CCardStack::GetTopCard() + 0xc) + 0x88)

if (r0_3 != 1)
    return r0_3

ascensionrules::CreateStateProcessAcquireOrDefeatTopOfCenterDeck(arg3, false, false, false)
return CStateMachine::PushListState(arg1) __tailcall
