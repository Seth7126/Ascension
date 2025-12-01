// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroToTopOfDeck26SelectAcquireFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x1201d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r8 = *(arg2 + 0x24c)
int32_t r9 = 0
int32_t r6 = *(r8 + 4)
int32_t result = ascension::CWorld::GetCenterRowCard(r6)

if (result != arg3)
    r9 = 1
    result = ascension::CWorld::GetCenterRowCard(r6)
    
    if (result != arg3)
        r9 = 2
        result = ascension::CWorld::GetCenterRowCard(r6)
        
        if (result != arg3)
            r9 = 3
            result = ascension::CWorld::GetCenterRowCard(r6)
            
            if (result != arg3)
                r9 = 4
                result = ascension::CWorld::GetCenterRowCard(r6)
                
                if (result != arg3)
                    r9 = 5
                    result = ascension::CWorld::GetCenterRowCard(r6)
                    
                    if (result != arg3)
                        result = ascension::CWorld::GetCenterRowCard(r6)
                        r9 = 7
                        
                        if (result == arg3)
                            r9 = 6

if (arg3 == 0)
    return result

if (*(arg2 + 0x268) != 0)
    ascension::CWorld::PlayActiveEffect(r6)

int32_t* r0_8 = *(arg2 + 0x264)

if (r0_8 != 0)
    void* r2_1 = r0_8 + *r0_8 + 4
    uint32_t r1_9 = zx.d(*r2_1)
    
    if (r1_9 u<= 7)
        uint32_t r3 = zx.d(*(arg3 + 8))
        *r2_1 = r1_9.b + 1
        r0_8[*r0_8 * 8 + r1_9 + 4] = r3

if (*(r6 + 0x30) u< 2)
    core::CWorldBase::OutputMessageFormat(r6, "%s acquires %s to top of deck\n", r8 + 0x10, 
        *(arg3 + 0xc) + 4)
    int32_t var_38_1 = 0
    ascension::CWorld::OutputAnimationCard(r6, arg3, 3, 7, r9, 2, zx.d(*(r8 + 8)), 0)
    ascensionrules::CreateStateRemoveCenterRowCard(r8, r9, nullptr, true, true, 0, 0, false, 
        nullptr, nullptr, 0, nullptr, 0)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    int32_t* r6_1 = operator new(0x38)
    CState::CState()
    *r6_1 = _vtable_for_ascensionrules::CStateProcessAcquireCardToTopOfDeck + 8
    r6_1[0xc] = r8
    r6_1[0xd] = arg3
else
    int32_t r7_2 = 1
    
    if (*(arg2 + 0x258) == 0)
        r7_2 = 2
        
        if (*(arg2 + 0x254) == 0)
            r7_2 = 3
    
    int32_t var_44_1 = r7_2
    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
        operator new(0x990), r8, arg3, 7, r9)

CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
