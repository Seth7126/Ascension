// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow24SelectAcquireToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x12ef14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r7 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r6 = *(r7 + 4)
uint32_t i_1 = ascension::CWorld::GetCenterRowCard(r6)

if (i_1 != 0)
    uint32_t i = i_1
    
    if (*(r6 + 0x30) u< 0xf)
    label_12efe8:
        int32_t var_38 = 0
        ascension::CWorld::AddToAcquiredCards(r6, i.b, 7, 2)
        ascension::CWorld::OutputEvent(r6, 4, zx.d(*(r7 + 8)), zx.d(*(i + 8)))
        ascension::CPlayer::AddTurnLog(r7, 3)
        ascension::CPlayer::AddOwnedCard(r7)
        core::CWorldBase::OutputMessageFormat(r6, "%s puts %s on top of deck\n", r7 + 0x10, 
            (*(*i + 0xc))(i), 0)
        uint32_t r0_17 = zx.d(*(r7 + 8))
        uint32_t var_28 = r0_17
        ascension::CWorld::OutputAnimationCard(r6, i, 3, 7, arg3, 2, r0_17, 1)
        ascension::CPlayer::PutCardOnTopOfDeck(r7)
        ascension::CWorld::RemoveCenterRowCard(r6, arg3.b)
        *(arg2 + arg3 + 0x6a0) = 1
        int32_t r0_23 = *(arg2 + 0x680) + 1
        *(arg2 + 0x680) = r0_23
        return r0_23
    
    i_1 = *(arg2 + 0x25c)
    
    if (i_1 s>= 1)
        void* __offset(CState, 0x2a0) r4_1 = arg2 + 0x2a0
        int32_t r1_1 = 0
        
        while (i != *(r4_1 - 0x40))
            r1_1 += 1
            r4_1 += 0x44
            
            if (r1_1 s>= i_1)
                return i_1
        
        void* r0_2 = *r4_1
        
        if (r0_2 == 0xffffffff)
            r0_2 = memchr(r4_1 - 0x20, 2, *(r4_1 - 0x24)) - (r4_1 - 0x20)
        
        if (zx.d(*(r4_1 + (r0_2 << 1) - 0x10)) != 0)
            core::CWorldBase::GetInstanceByID(r6)
            ascension::CWorld::PlayActiveEffect(r6)
        
        goto label_12efe8

return i_1
