// 函数: _ZN14ascensionrules16BanishThisTrophyEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10c0d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r6 = *(arg5 + 0xc)
uint32_t r5 = *(arg5 + 0x10)
uint32_t var_20 = zx.d(r6[2].w)
ascension::CWorld::OutputAnimationCard(arg2, r5, 6, 5, zx.d(*(arg5 + 8)), 9, 0, 
    &(*__elf_header.ident.signature)[2])
int32_t result = ascension::CPlayer::RemoveTrophyFromPlay(r6)

if (result == 0)
    return result

if (r6 == *(arg2 + 0xb20))
    ascension::CWorld::AddToBanishedCardCount()

ascension::CPlayer::RemoveOwnedCard(r6)
ascension::CWorld::PutCardInVoid(arg2)
ascension::CPlayer::AddTurnLog(r6, 6)
return core::CWorldBase::OutputMessageFormat(arg2, "%s banishes %s from play\n", 
    (*(*r6 + 0xc))(r6), (*(*r5 + 0xc))(r5)) __tailcall
