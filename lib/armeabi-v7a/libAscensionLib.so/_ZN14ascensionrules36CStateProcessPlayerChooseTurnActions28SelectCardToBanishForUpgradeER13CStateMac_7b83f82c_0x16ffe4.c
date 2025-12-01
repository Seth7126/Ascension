// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions28SelectCardToBanishForUpgradeER13CStateMachineP6CStateiPj
// 地址: 0x16ffe4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r5 = *(arg2 + 0x24c)
int32_t r0 = *(r5 + 4)

if (*(r0 + 0xb64) s>= 1)
    ascension::CWorld::SetBanishFromHandToUpgradeCount(r0)

int32_t r7 = *(*(arg3 + 0xc) + 0xa4)
ascensionrules::CreateStateProcessBanishSequence(r5, arg3, 1, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
ascensionrules::CreateStateProcessAcquireHeroOfHonorValueToHand(r5, r7 + 1)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
