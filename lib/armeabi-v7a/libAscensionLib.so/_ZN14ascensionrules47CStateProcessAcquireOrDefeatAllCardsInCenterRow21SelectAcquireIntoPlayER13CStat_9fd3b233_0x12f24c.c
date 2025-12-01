// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow21SelectAcquireIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x12f24c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r8 = *(arg2 + 0x24c)
uint32_t r10 = 0
int32_t r7 = *(r8 + 4)
int32_t r0_1 = ascension::CWorld::GetCenterRowCard(r7)

if (r0_1 != arg3)
    r10 = 1
    r0_1 = ascension::CWorld::GetCenterRowCard(r7)
    
    if (r0_1 != arg3)
        r10 = 2
        r0_1 = ascension::CWorld::GetCenterRowCard(r7)
        
        if (r0_1 != arg3)
            r10 = 3
            r0_1 = ascension::CWorld::GetCenterRowCard(r7)
            
            if (r0_1 != arg3)
                r10 = 4
                r0_1 = ascension::CWorld::GetCenterRowCard(r7)
                
                if (r0_1 != arg3)
                    r10 = 5
                    r0_1 = ascension::CWorld::GetCenterRowCard(r7)
                    
                    if (r0_1 != arg3)
                        r0_1 = ascension::CWorld::GetCenterRowCard(r7)
                        r10 = 7
                        
                        if (r0_1 == arg3)
                            r10 = 6

if (arg3 != 0)
    r0_1 = *(arg2 + 0x25c)
    
    if (r0_1 s>= 1)
        int32_t r6_1 = 0
        int32_t r1_7 = 0
        
        do
            void* r2 = arg2 + r6_1
            
            if (*(r2 + 0x260) == arg3)
                void* r9 = *(r2 + 0x2a0)
                
                if (r9 == 0xffffffff)
                    r9 = memchr(r2 + 0x280, 4, *(r2 + 0x27c)) - (r2 + 0x280)
                
                uint32_t r1_8 = zx.d(*(arg2 + r9 + r6_1 + 0x288))
                uint32_t var_3c
                int32_t var_38
                int32_t var_34
                
                if (r1_8 != 0)
                    if (zx.d(*(r7 + 0xb3d)) == 0 || *(r7 + 0xb48) s< 1)
                        ascension::CPlayer::RemoveInsightCount(r8)
                    else
                        uint32_t r0_14 = zx.d(*(r7 + 0xb29))
                        
                        if (r0_14 != 0)
                            r0_14 = 8
                        
                        var_3c = r0_14
                        var_38 = 8
                        var_34 = 0
                        int32_t var_28_1 = ascensionrules::CreateStateMustPayResources(r8, arg3, 0, 
                            0, r1_8, var_3c, 8, 0)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                
                if (zx.d(*(arg2 + (r9 << 1) + r6_1 + 0x290)) != 0)
                    core::CWorldBase::GetInstanceByID(r7)
                    ascension::CWorld::PlayActiveEffect(r7)
                
                *(arg2 + r10 + 0x6a0) = 1
                CState* r0_30
                
                if (*(r7 + 0x30) u> 0x12)
                    int32_t var_40_3 = 0
                    ascension::CWorld::AddToAcquiredCards(r7, arg3.b, 7, 4)
                    ascension::CWorld::OutputEvent(r7, 4, zx.d(*(r8 + 8)), zx.d(*(arg3 + 8)))
                    ascension::CPlayer::AddTurnLog(r8, 3)
                    ascension::CPlayer::AddOwnedCard(r8)
                    core::CWorldBase::OutputMessageFormat(r7, "%s puts %s directly into play\n", 
                        r8 + 0x10, (*(*arg3 + 0xc))(arg3), 0, var_3c, var_38, var_34)
                    uint32_t r0_41 = zx.d(*(ascension::CPlayer::PutConstructInPlay(r8, arg3.b) + 8))
                    uint32_t var_30_1 = zx.d(*(r8 + 8))
                    ascension::CWorld::OutputAnimationCard(r7, arg3, 3, 7, r10, 4, r0_41, 1)
                    ascension::CWorld::RemoveCenterRowCard(r7, r10.b)
                    *(arg2 + 0xb34) = r8
                    *(arg2 + 0xb38) = arg3
                    *(arg2 + 0xaf0) = 0
                    ascensionrules::CreateStateHandleEvent(r7, arg2 + 0xae8, true, 0, nullptr, 0)
                    CState::AddOwnedChild(arg2)
                    r0_30 = arg2
                else
                    int32_t var_3c_1 = 4
                    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                        operator new(0x990), r8, arg3, 7, r10)
                    CState::AddOwnedChild(arg2)
                    r0_30 = arg2
                
                CStateList::AppendState(r0_30)
                int32_t r0_48 = *(arg2 + 0x680) + 1
                *(arg2 + 0x680) = r0_48
                return r0_48
            
            r1_7 += 1
            r6_1 += 0x44
        while (r1_7 s< r0_1)

return r0_1
