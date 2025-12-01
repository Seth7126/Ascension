// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x12f0b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r7 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r10 = *(r7 + 4)
int32_t* r0_1 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_1 != 0)
    int32_t* r5_1 = r0_1
    r0_1 = *(arg2 + 0x25c)
    
    if (r0_1 s>= 1)
        void* __offset(CState, 0x2a0) r6_1 = arg2 + 0x2a0
        int32_t r1_1 = 0
        
        do
            if (r5_1 == *(r6_1 - 0x40))
                void* r0_2 = *r6_1
                
                if (r0_2 == 0xffffffff)
                    r0_2 = memchr(r6_1 - 0x20, 1, *(r6_1 - 0x24)) - (r6_1 - 0x20)
                
                if (zx.d(*(r6_1 + (r0_2 << 1) - 0x10)) != 0)
                    core::CWorldBase::GetInstanceByID(r10)
                    ascension::CWorld::PlayActiveEffect(r10)
                
                int32_t var_38 = 0
                ascension::CWorld::AddToAcquiredCards(r10, r5_1.b, 7, 1)
                ascension::CWorld::OutputEvent(r10, 4, zx.d(*(r7 + 8)), zx.d(r5_1[2].w))
                ascension::CPlayer::AddTurnLog(r7, 3)
                ascension::CPlayer::AddOwnedCard(r7)
                core::CWorldBase::OutputMessageFormat(r10, "%s acquires %s into hand\n", r7 + 0x10, 
                    (*(*r5_1 + 0xc))(r5_1), 0)
                uint32_t r0_17 = zx.d(*(r7 + 8))
                uint32_t var_28 = r0_17
                ascension::CWorld::OutputAnimationCard(r10, r5_1, 3, 7, arg3, 1, r0_17, 1)
                ascension::CPlayer::PutCardInHand(r7)
                ascension::CWorld::RemoveCenterRowCard(r10, arg3.b)
                *(arg2 + arg3 + 0x6a0) = 1
                int32_t r0_23 = *(arg2 + 0x680) + 1
                *(arg2 + 0x680) = r0_23
                return r0_23
            
            r1_1 += 1
            r6_1 += 0x44
        while (r1_1 s< r0_1)

return r0_1
