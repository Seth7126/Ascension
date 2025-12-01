// 函数: _ZN14ascensionrules49CStateProcessAcquireAllCenterRowHeroesToTopOfDeck19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x12d1b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r7 = *(arg2 + 0x24c)
int32_t r6 = *(r7 + 4)
void* result = ascension::CWorld::GetCenterRowCard(r6)

if (result != 0)
    void* i = result
    
    if (zx.d(*(arg2 + 0x250)) == 0)
        result = *(arg2 + 0x254)
        
        if (result s>= 1)
            void* __offset(CState, 0x298) r5_1 = arg2 + 0x298
            int32_t r1_7 = 0
            
            while (i != *(r5_1 - 0x40))
                r1_7 += 1
                r5_1 += 0x44
                
                if (r1_7 s>= result)
                    return result
            
            void* r0_14 = *r5_1
            
            if (r0_14 == 0xffffffff)
                r0_14 = memchr(r5_1 - 0x20, 1, *(r5_1 - 0x24)) - (r5_1 - 0x20)
            
            if (zx.d(*(r5_1 + (r0_14 << 1) - 0x10)) != 0)
                core::CWorldBase::GetInstanceByID(r6)
                ascension::CWorld::PlayActiveEffect(r6)
            
            goto label_12d204
    else
    label_12d204:
        int32_t var_38_1 = 0
        ascension::CWorld::AddToAcquiredCards(r6, i.b, 7, 1)
        ascension::CWorld::OutputEvent(r6, 4, zx.d(*(r7 + 8)), zx.d(*(i + 8)))
        ascension::CPlayer::AddTurnLog(r7, 3)
        ascension::CPlayer::AddOwnedCard(r7)
        core::CWorldBase::OutputMessageFormat(r6, "%s acquires %s into hand\n", r7 + 0x10, 
            (*(*i + 0xc))(i), 0)
        uint32_t r0_10 = zx.d(*(r7 + 8))
        uint32_t var_28_1 = r0_10
        ascension::CWorld::OutputAnimationCard(r6, i, 3, 7, arg3, 1, r0_10, 1)
        ascension::CPlayer::PutCardInHand(r7)
        ascension::CWorld::RemoveCenterRowCard(r6, arg3.b)
        result = arg2 + arg3
        *(result + 0x454) = 1

return result
