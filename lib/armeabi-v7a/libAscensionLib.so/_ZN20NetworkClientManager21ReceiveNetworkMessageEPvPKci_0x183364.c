// 函数: _ZN20NetworkClientManager21ReceiveNetworkMessageEPvPKci
// 地址: 0x183364
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r5 = arg1
int32_t result = 1
int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg2 + 4)

if (r1 == 0xffffffff)
labelid_3a:
    result = 1
else
    int32_t (* const str)(AvailableGame*, AvailableGame*)
    uint32_t var_430
    int32_t r0_54
    void* r0_149
    int32_t r1_24
    
    if (r1 != 0)
        void** r0_11 = *(r5 + 0xdc)
        int32_t r2_3 = *(r5 + 0xe0)
        uint32_t* r6_4
        
        if (r0_11 == r2_3)
        label_183644:
            void** r0_31 = *(r5 + 0xe8)
            int32_t r2_10 = *(r5 + 0xec)
            
            if (r0_31 == r2_10)
            labelid_3a:
                result = 1
            else
                while (true)
                    r6_4 = *r0_31
                    r0_31 = &r0_31[1]
                    
                    if (r6_4[1] == r1)
                        break
                    
                    if (r2_10 == r0_31)
                        goto label_184390_2
                
                if (r6_4 != 0)
                    goto label_183678
                
            labelid_3a:
                result = 1
        else
            while (true)
                r6_4 = *r0_11
                r0_11 = &r0_11[1]
                
                if (r6_4[1] == r1)
                    break
                
                if (r2_3 == r0_11)
                    goto label_183644
            
            if (r6_4 == 0)
                goto label_183644
            
        label_183678:
            int32_t r0_32 = *arg2
            int32_t r2_22
            
            if (r0_32 s<= 0xd2d2d2d1)
                if (r0_32 == 0xcbcbcbcb)
                    int32_t r7_12 = r6_4[0x28a]
                    
                    if (r7_12 == 0)
                        int32_t r0_150 = operator new(0x18)
                        r7_12 = r0_150
                        NetworkChatList::NetworkChatList(r0_150)
                        r6_4[0x28a] = r7_12
                    
                    uint32_t r5_11 = zx.d(*(arg2 + 0x1a))
                    
                    if (r5_11 != 0)
                        r5_11 = &arg2[0x1c + r5_11]
                    
                    uint32_t var_464_4 = r5_11
                    void* var_45c_3 = &arg2[0x1c]
                    NetworkChatList::AddChatMessage(r7_12, *(arg2 + 0xc), zx.d(*(arg2 + 8)), 
                        *(arg2 + 0x10), (*(arg2 + 0x14)).w, zx.d(*(arg2 + 0x18)))
                    
                    if (*(arg2 + 0xc) != *(r5 + 0xa4))
                    labelid_3a:
                        result = 1
                    else
                        uint32_t r5_12 = zx.d(*(arg2 + 8))
                        
                        if (r6_4[0x289] u>= r5_12)
                        labelid_3a:
                            result = 1
                        else
                            int32_t* r0_155 = *(r5 + 4)
                            
                            if (r0_155 == 0)
                            labelid_3a:
                                result = 1
                            else
                                void** r2_37 = *(r5 + 0xdc)
                                int32_t r3_26 = *(r5 + 0xe0)
                                
                                if (r2_37 == r3_26)
                                labelid_3a:
                                    result = 1
                                else
                                    int32_t r1_71 = r6_4[1]
                                    void* r4_16
                                    
                                    while (true)
                                        r4_16 = *r2_37
                                        r2_37 = &r2_37[1]
                                        
                                        if (*(r4_16 + 4) == r1_71)
                                            break
                                        
                                        if (r3_26 == r2_37)
                                            goto label_184390_2
                                    
                                    if (r4_16 == 0)
                                    labelid_3a:
                                        result = 1
                                    else if (zx.d(*(r4_16 + 0x1c)) != 0
                                            && zx.d(*(r4_16 + 0x4c)) != 0
                                            && zx.d(*(r4_16 + 0x7c)) != 0)
                                        if (zx.d(*(r4_16 + 0xac)) == 0 && *(r4_16 + 0xa24) u< r5_12)
                                            goto label_184940
                                        
                                    labelid_3a:
                                        result = 1
                                    else if (*(r4_16 + 0xa24) u>= r5_12)
                                    labelid_3a:
                                        result = 1
                                    else
                                    label_184940:
                                        int32_t var_434_3 = r1_71
                                        str = 0x100c
                                        var_430 = r5_12
                                        (*(*r0_155 + 8))(r0_155, &str, 0xc)
                                        *(r4_16 + 0xa24) = r5_12
                                        result = 1
                else if (r0_32 == 0xcdcdcdcd)
                    uint32_t r9_8 = r6_4[0x28a]
                    
                    if (r9_8 == 0)
                        uint32_t r0_156 = operator new(0x18)
                        r9_8 = r0_156
                        NetworkChatList::NetworkChatList(r0_156)
                        r6_4[0x28a] = r9_8
                    
                    if (zx.d(*(arg2 + 0xa)) != 0)
                        uint32_t r6_10 = zx.d(*(arg2 + 8))
                        int32_t i = 0
                        void* r5_13 = &arg2[0xc]
                        
                        do
                            void* r1_73 = zx.d(*(r5_13 + 8))
                            
                            if (r1_73 != 0)
                                r1_73 += &arg2[0xc]
                            
                            void* var_464_5 = r1_73
                            void* var_45c_4 = &arg2[0xc + zx.d(*(r5_13 + 6))]
                            NetworkChatList::AddChatMessage(r9_8, *r5_13, r6_10 & 0xffff, 
                                *(r5_13 + 0xa), (*(r5_13 + 0xe)).w, zx.d(*(r5_13 + 4)))
                            i += 1
                            r5_13 += 0x14
                            r6_10 += 1
                        while (i u< zx.d(*(arg2 + 0xa)))
                    
                label_184354:
                    result = 1
                else
                    result = 1
                    
                    if (r0_32 == 0xd1d1d1d1)
                        printf("   --- start game %d\n")
                        int16_t r1_30 = *(arg2 + 0xfc)
                        *(r6_4 + 0xe) = *(arg2 + 0xf8)
                        *(r6_4 + 0x12) = r1_30
                        uint32_t r5_5 = operator new(0xbf0)
                        uint32_t* var_454_1 = nullptr
                        int32_t var_464_1 = 0
                        ascension::CWorld::CWorld(r5_5, r6_4 + 0xe, *r6_4, (r6_4[0x3d]).b, false)
                        char const* r4_10 = arg2
                        *(r5_5 + 0xa2d) = 1
                        r6_4[0x281] = *(arg2 + 8)
                        int32_t r0_72 = *(arg2 + 0xc)
                        r6_4[0x35] = r0_72
                        r6_4[0x282] = r0_72
                        
                        if (r0_72 != 0)
                            int32_t r1_32 = 0x38
                            int32_t r3_11 = 0x124
                            int32_t r9_4 = 0
                            var_454_1 = nullptr
                            uint32_t var_450_1 = r5_5
                            int32_t i_1
                            
                            do
                                void* r5_6 = &r4_10[r9_4]
                                void* r8_2 = r6_4 + r9_4
                                int32_t r0_73 = *(r5_6 + 0x10)
                                
                                if (r0_73 != r6_4[2])
                                    *(r8_2 + 0x1c) = 1
                                else
                                    *(r8_2 + 0x1c) = 0
                                    var_454_1 = r6_4 + r3_11
                                
                                *(r8_2 + 0x14) = r0_73
                                int16_t r0_74 = *(r5_6 + 0x16)
                                *(r8_2 + 0x1d) = 0
                                *(r8_2 + 0x18) = r0_74
                                *(r8_2 + 0x1e) = *(r5_6 + 0x14)
                                strcpy(r8_2 + 0x24, r5_6 + 0x18)
                                r4_10 = arg2
                                *(r8_2 + 0x20) = *(r4_10 + (r1_32 << 2))
                                r5_5 = var_450_1
                                ascension::CWorld::AddPlayer(r5_5, *(r5_6 + 0x10), r8_2 + 0x24)
                                r9_4 += 0x30
                                i_1 = r1_32 - 0x37
                                r3_11 += 0x34
                                r1_32 += 1
                            while (i_1 u< *(r4_10 + 0xc))
                        
                        r6_4[0x36].b = r4_10[0xd8]
                        r6_4[0x37] = *(r4_10 + 0xd4)
                        r6_4[0x38] = zx.d(*(r4_10 + 0xd0))
                        r6_4[0x39] = zx.d(*(r4_10 + 0xd2))
                        r6_4[0x288] = *(r4_10 + 0xd9)
                        r6_4[0x286] = *(r4_10 + 0xf0)
                        var_454_1[1].b = 0
                        *var_454_1 = r5_5
                        int32_t r0_86 = operator new(0x20)
                        CStateMachine::CStateMachine()
                        var_454_1[3] = r0_86
                        CStateMachine* r0_87 = operator new(0x400)
                        GameOptionManager::GameOptionManager()
                        var_454_1[4] = r0_87
                        r6_4[2]
                        GameOptionManager::Attach(r0_87, var_454_1[3])
                        int32_t r0_90 = ascensionrules::CreateStateProcessGame(r5_5)
                        CState* r0_91 = var_454_1[3]
                        var_454_1[2] = r0_90
                        CStateMachine::PushState(r0_91)
                        CStateMachine::SetOptionListEndCallback(var_454_1[3], 
                            NetworkClientManager::NetOptionListEndListener)
                        r6_4[0x287] = time(nullptr)
                        NetworkClientManager::InsertGameData(r5)
                        r0_54 = *(r5 + 0xdc)
                        r1_24 = *(r5 + 0xe0)
                        r2_22 = *__stack_chk_guard
                        goto label_1841e8
            else if (r0_32 s<= 0x4040403)
                if (r0_32 == 0xd2d2d2d2)
                    printf("   --- update game %d\n", r1, 0xd2d2d2d2)
                    r6_4[0x281] = *(arg2 + 8)
                    r6_4[0x36].b = arg2[0x14]
                    r6_4[0x37] = *(arg2 + 0x10)
                    r6_4[0x38] = zx.d(*(arg2 + 0xc))
                    int32_t r0_146 = r6_4[0x35]
                    r6_4[0x39] = zx.d(*(arg2 + 0xe))
                    r6_4[0x288] = *(arg2 + 0x15)
                    
                    if (r0_146 s>= 1)
                        void* r1_66 = &r6_4[8]
                        int32_t r3_23 = 0
                        
                        do
                            int32_t r7_11 = *(arg2 + 0x1c + (r3_23 << 2))
                            r3_23 += 1
                            *r1_66 = r7_11
                            r1_66 += 0x30
                        while (r3_23 s< r0_146)
                    
                    r6_4[0x287] = time(nullptr)
                label_1841d4:
                    NetworkClientManager::InsertGameData(r5)
                    r0_54 = *(r5 + 0xdc)
                    r1_24 = *(r5 + 0xe0)
                label_1841e0:
                    r2_22 = *__stack_chk_guard
                label_1841e8:
                    
                    if (r2_22 != r0)
                        __stack_chk_fail()
                        noreturn
                    
                    r0_149 = r1_24 - r0_54
                    goto label_184620
                
                result = 1
                
                if (r0_32 == 0xd6d6d6d6)
                    printf("   --- update staging data %d\n")
                    r6_4[0x281] = *(arg2 + 8)
                    uint32_t r0_34 = zx.d(*(arg2 + 0xc))
                    r6_4[0x282] = r0_34
                    r6_4[0x286] = *(arg2 + 0x10)
                    r6_4[0x35] = zx.d(*(arg2 + 0xe))
                    
                    if (r0_34 != 0)
                        int32_t r5_1 = 0
                        int32_t r7_2 = 0
                        uint32_t r0_39
                        
                        do
                            void* r1_12 = &arg2[r5_1]
                            void* r2_11 = r6_4 + r5_1
                            int32_t r0_35 = *(r1_12 + 0x14)
                            *(r2_11 + 0x14) = r0_35
                            *(r2_11 + 0x18) = *(r1_12 + 0x1a)
                            int32_t r3_7 = r6_4[2]
                            *(r2_11 + 0x1d) = 0
                            char r0_36 = r0_35.b - r3_7.b
                            
                            if (r0_35 != r3_7)
                                r0_36 = 1
                            
                            *(r2_11 + 0x1c) = r0_36
                            *(r2_11 + 0x1e) = *(r1_12 + 0x18)
                            strcpy(r2_11 + 0x24, r1_12 + 0x1c)
                            r0_39 = zx.d(*(arg2 + 0xc))
                            r7_2 += 1
                            r5_1 += 0x30
                        while (r7_2 u< r0_39)
                        
                        if (r0_39 != 0)
                            int32_t i_2 = 0
                            
                            do
                                *(&r6_4[0x288] + i_2) = i_2.b
                                i_2 += 1
                            while (i_2 u< zx.d(*(arg2 + 0xc)))
                    
                    int32_t r0_41 = *(arg2 + 0xd8)
                    *(r6_4 + 0x12) = *(arg2 + 0xdc)
                    *(r6_4 + 0xe) = r0_41
                    goto label_1841d4
            else if (r0_32 == 0x4040404)
                int32_t r10_7 = r6_4[0x43]
                result = 0
                int32_t r0_162 = *(arg2 + 8)
                
                if (r0_162 u<= r10_7)
                    if (r0_162 + 1 u> r6_4[0x46])
                        r6_4[0x46] = r0_162 + 1
                    
                    if (r0_162 u>= r10_7)
                        int32_t r1_81 = r6_4[0x47]
                        int32_t r2_42 = r1_81
                        
                        if (r1_81 == 0)
                            r2_42 = 0x100
                        
                        int32_t r7_14 = r2_42 - 0x80
                        int32_t r4_18 = 0x800 - (r2_42 << 4)
                        int32_t r0_175 = r10_7 + 1
                        
                        do
                            r7_14 += 0x80
                            r4_18 -= 0x800
                        while (r0_175 s>= r7_14)
                        
                        int32_t r9_9
                        
                        if (r1_81 == r7_14)
                            r9_9 = r6_4[0x48]
                        
                        if (r1_81 != r7_14 || r9_9 == 0)
                            uint32_t r0_176
                            int32_t r1_82
                            r1_82:r0_176 = mulu.dp.d(r7_14, 0x10)
                            
                            if (r1_82 != 0)
                                r1_82 = 1
                            
                            if (r1_82 != 0)
                                r0_176 = 0xffffffff
                            
                            int32_t r0_177 = operator new[](r0_176)
                            void* r5_14 = r6_4[0x48]
                            r9_9 = r0_177
                            
                            if (r5_14 == 0)
                                __aeabi_memclr4(r9_9, 0 - r4_18)
                            else
                                __aeabi_memcpy4(r9_9, r5_14, r10_7 << 4)
                                __aeabi_memclr4(r9_9 + (r10_7 << 4), 0 - (r10_7 << 4) - r4_18)
                                operator delete[](r5_14)
                            
                            r10_7 = r6_4[0x43]
                            r6_4[0x47] = r7_14
                            r0_175 = r10_7 + 1
                            r6_4[0x48] = r9_9
                        
                        result = 1
                        r6_4[0x43] = r0_175
                        int32_t* r9_11 = r9_9 + (r10_7 << 4)
                        *r9_11 = *(arg2 + 0xc)
                        r9_11[1].w = *(arg2 + 0x10)
                        *(r9_11 + 6) = *(arg2 + 0x14)
                        r9_11[2].w = *(arg2 + 0x12)
                        r9_11[3] = *(arg2 + 0x18)
                    else
                    labelid_3a:
                        result = 1
            else if (r0_32 != 0x5050505)
            labelid_3a:
                result = 1
            else
                int32_t r3_17 = r6_4[0x45]
                int32_t r5_9 = r6_4[0x43] - r3_17
                
                if (r5_9 u>= 0x50)
                    r5_9 = 0x50
                
                __aeabi_memcpy4(r6_4[0x48] + (r3_17 << 4), &arg2[0xc], r5_9 << 4)
                int32_t r1_50 = r6_4[0x46]
                int32_t r0_115 = r6_4[0x45] + r5_9
                r6_4[0x45] = r0_115
                
                if (r0_115 u> r1_50)
                    r6_4[0x46] = r0_115
                
                if (r0_115 == r6_4[0x43])
                    result = 1
                    r6_4[0x45] = 0xffffffff
    else
        int32_t r0_1 = *arg2
        int32_t i_3
        
        if (r0_1 s<= 0xcdcdcdcc)
            if (r0_1 s> 0xaeaeaead)
                if (r0_1 s> 0xbebebebd)
                    if (r0_1 == 0xbebebebe)
                        i_3 = *(arg2 + 8)
                        *(r5 + 0xa0) = i_3
                        
                        if (*__stack_chk_guard != r0)
                            __stack_chk_fail()
                            noreturn
                        
                        return OutputNetworkEvent(0xb, i_3) __tailcall
                    
                    if (r0_1 != 0xcbcbcbcb)
                    labelid_3a:
                        result = 1
                    else
                        int32_t r6_7 = *(r5 + 0x5e0)
                        
                        if (r6_7 == 0)
                            int32_t r0_109 = operator new(0x18)
                            r6_7 = r0_109
                            NetworkChatList::NetworkChatList(r0_109)
                            *(r5 + 0x5e0) = r6_7
                        
                        uint32_t r5_8 = zx.d(*(arg2 + 0x1a))
                        
                        if (r5_8 != 0)
                            r5_8 = &arg2[0x1c + r5_8]
                        
                        uint32_t var_464_2 = r5_8
                        void* var_45c_1 = &arg2[0x1c]
                        NetworkChatList::AddChatMessage(r6_7, *(arg2 + 0xc), zx.d(*(arg2 + 8)), 
                            *(arg2 + 0x10), (*(arg2 + 0x14)).w, zx.d(*(arg2 + 0x18)))
                        result = 1
                else if (r0_1 == 0xaeaeaeae)
                    result = 1
                    *(r5 + 0x8f) = 1
                else
                    result = 1
                    
                    if (r0_1 == 0xbcbcbcbc)
                        int32_t r0_55 = *(arg2 + 8)
                        int32_t r6_6 = r0_55 u>> 0x18 | (r0_55 u>> 0x10 & 0xff) << 8
                            | (r0_55 u>> 8 & 0xff) << 0x10 | (r0_55 & 0xff) << 0x18
                        
                        if (r0_55 != 0)
                            void* r4_7 = &arg2[0xc]
                            int32_t r9_3 = 0
                            
                            do
                                int32_t (* str_1)(AvailableGame*, AvailableGame*) =
                                    operator new(0x30)
                                str = str_1
                                int32_t r0_57 = *r4_7
                                *str_1 = r0_57 u>> 0x18 | (r0_57 u>> 0x10 & 0xff) << 8
                                    | (r0_57 u>> 8 & 0xff) << 0x10 | (r0_57 & 0xff) << 0x18
                                uint32_t r0_59 = zx.d(*(r4_7 + 4))
                                *(str_1 + 4) =
                                    (ror.w(r0_59 u>> 0x10, 0x10) << 0x10).w | ror.w(r0_59.w, 0x10)
                                uint32_t r0_61 = zx.d(*(r4_7 + 6))
                                *(str_1 + 6) =
                                    (ror.w(r0_61 u>> 0x10, 0x10) << 0x10).w | ror.w(r0_61.w, 0x10)
                                strncpy(str_1 + 8, r4_7 + 8, 0x1f)
                                *(str_1 + 0x26) = 0
                                int32_t (** r0_64)(AvailableGame*, AvailableGame*) = *(r5 + 0x518)
                                
                                if (r0_64 == *(r5 + 0x51c))
                                    std::__ndk1::vector<NetworkFriend*, std::__ndk1::allocator<NetworkFriend*> >::__push_back_slow_path<NetworkFriend* const&>(
                                        r5 + 0x514)
                                else
                                    *r0_64 = str
                                    *(r5 + 0x518) += 4
                                
                                r9_3 += 1
                                r4_7 += 0x30
                            while (r9_3 u< r6_6)
                        
                        result = OutputNetworkEvent(0xf, r6_6)
            else if (r0_1 s> 0xa9a9a9a8)
                if (r0_1 == 0xa9a9a9a9)
                    printf("received create account reply %s (ID:%08x)\n", &arg2[0x10], 
                        *(arg2 + 0xc))
                    i_3 = 9
                    
                    if (*(arg2 + 8) == 0)
                        i_3 = 8
                    
                    goto label_18411c
                
                result = 1
                
                if (r0_1 == 0xacacacac)
                    printf("received login reply (ID:%08x)\n", *(arg2 + 8))
                    result = 1
                    *(r5 + 0x8e) = 1
                    *(r5 + 0xa4) = *(arg2 + 8)
                    *(r5 + 0xa8) = *(arg2 + 0xc)
                    strcpyUtf8(r5 + 0xb0, 0x1f, &arg2[0x10])
                    
                    if (zx.d(*(r5 + 0x95)) != 0)
                        int32_t var_434_1 = 0
                        str = 0xd9d9d9d9
                        __aeabi_memcpy4(&var_430, r5 + 0x100, 0x400)
                        int32_t* r0_102 = *(r5 + 4)
                        (*(*r0_102 + 8))(r0_102, &str, 0x408)
                    
                    OutputNetworkEvent(0x11, *(arg2 + 0x30))
            else if (r0_1 == 0x82828282)
                i_3 = *(arg2 + 8)
                int32_t* r3_20 = *(r5 + 0x508)
                int32_t (** r2_29)(AvailableGame*, AvailableGame*) = *(r5 + 0x50c)
                
                if (r3_20 != r2_29)
                    while (*r3_20 != i_3)
                        r3_20 = &r3_20[2]
                        
                        if (r2_29 == r3_20)
                            goto label_183fa4
                    
                    r3_20[1] = *(arg2 + 0xc)
                    
                    if (*__stack_chk_guard != r0)
                        __stack_chk_fail()
                        noreturn
                    
                    return OutputNetworkEvent(0xe, i_3) __tailcall
                
            label_183fa4:
                int32_t (* r3_21)(AvailableGame*, AvailableGame*) = *(arg2 + 0xc)
                str = i_3
                
                if (r2_29 u>= *(r5 + 0x510))
                    std::__ndk1::vector<NetworkClientManager::UserOnlineStatus, std::__ndk1::allocator<NetworkClientManager::UserOnlineStatus> >::__push_back_slow_path<NetworkClientManager::UserOnlineStatus>(
                        r5 + 0x508)
                else
                    *r2_29 = str
                    r2_29[1] = r3_21
                    *(r5 + 0x50c) += 8
                
                result = OutputNetworkEvent(0xe, *(arg2 + 8))
            else
                result = 1
                
                if (r0_1 == 0x85858585)
                    int32_t r2_4 = *(r5 + 0x524)
                    int32_t r1_2 = *(arg2 + 8)
                    
                    if (r1_2 == r2_4)
                        *(r5 + 0x528) = r1_2
                        *(r5 + 0x52c) = *(arg2 + 0xe)
                        strncpy(r5 + 0x530, &arg2[0x10], 0x1f)
                        *(r5 + 0x54e) = 0
                        *(r5 + 0x558) = *(arg2 + 0x38)
                        *(r5 + 0x55c) = *(arg2 + 0x3c)
                        *(r5 + 0x560) = *(arg2 + 0x40)
                        int32_t r0_17 = *(arg2 + 0x48)
                        int32_t r2_5 = *(arg2 + 0x44)
                        *(r5 + 0x56c) = *(arg2 + 0x4c)
                        *(r5 + 0x568) = r0_17
                        *(r5 + 0x564) = r2_5
                        int32_t r1_5 = *(arg2 + 0x54)
                        int32_t r2_6 = *(arg2 + 0x58)
                        *(r5 + 0x570) = *(arg2 + 0x50)
                        *(r5 + 0x74) = r1_5
                        *(r5 + 0x78) = r2_6
                        
                        if (*(r5 + 0x528) == *(r5 + 0xa4))
                            *(r5 + 0x584) = *(arg2 + 8)
                            *(r5 + 0x588) = *(arg2 + 0xe)
                            strncpy(r5 + 0x58c, &arg2[0x10], 0x1f)
                            *(r5 + 0x5aa) = 0
                            *(r5 + 0x5b4) = *(arg2 + 0x38)
                            *(r5 + 0x5b8) = *(arg2 + 0x3c)
                            *(r5 + 0x5bc) = *(arg2 + 0x40)
                            int32_t r1_8 = *(arg2 + 0x48)
                            int32_t r2_7 = *(arg2 + 0x4c)
                            *(r5 + 0x5c0) = *(arg2 + 0x44)
                            *(r5 + 0xc4) = r1_8
                            *(r5 + 0xc8) = r2_7
                            int32_t r1_9 = *(arg2 + 0x54)
                            int32_t r2_8 = *(arg2 + 0x58)
                            *(r5 + 0x5cc) = *(arg2 + 0x50)
                            *(r5 + 0x5d0) = r1_9
                            *(r5 + 0x5d4) = r2_8
                        
                        *(r5 + 0x524) = 0
                        
                        if (*__stack_chk_guard != r0)
                            __stack_chk_fail()
                            noreturn
                        
                        return OutputNetworkEvent(0xd, *(arg2 + 8)) __tailcall
                    
                    printf("   ### network profile is mismatch (%d != %d)\n", r1_2, r2_4)
                    result = 0
        else if (r0_1 s<= 0xf7f7f7f6)
            if (r0_1 s> 0xdbdbdbda)
                if (r0_1 == 0xdbdbdbdb)
                    printf("received error message (Code: %d)\n", *(arg2 + 8))
                    i_3 = *(arg2 + 8)
                    
                    if (i_3 - 1 u>= 7)
                        i_3 = *(r5 + 0x90)
                    else
                    label_18411c:
                        *(r5 + 0x90) = i_3
                    
                    if (*__stack_chk_guard != r0)
                        __stack_chk_fail()
                        noreturn
                    
                    return OutputNetworkEvent(4, i_3) __tailcall
                
                if (r0_1 != 0xdededede)
                label_184390:
                    result = 1
                else
                    uint32_t r0_103 = zx.d(arg2[8])
                    result = 1
                    
                    if (r0_103 != 0)
                        r0_103 = 1
                    
                    *(r5 + 0x5e4) = r0_103.b
                    uint32_t r0_104 = zx.d(arg2[9])
                    
                    if (r0_104 != 0)
                        r0_104 = 1
                    
                    *(r5 + 0x5e5) = r0_104.b
                    uint32_t r0_105 = zx.d(arg2[0xa])
                    
                    if (r0_105 != 0)
                        r0_105 = 1
                    
                    *(r5 + 0x5e6) = r0_105.b
                    uint32_t r0_106 = zx.d(arg2[0xb])
                    
                    if (r0_106 != 0)
                        r0_106 = 1
                    
                    *(r5 + 0x5e7) = r0_106.b
                    uint32_t r0_107 = zx.d(arg2[0xc])
                    
                    if (r0_107 != 0)
                        r0_107 = 1
                    
                    *(r5 + 0x5e8) = r0_107.b
                    uint32_t r0_108 = zx.d(arg2[0xd])
                    
                    if (r0_108 != 0)
                        r0_108 = 1
                    
                    *(r5 + 0x5e9) = r0_108.b
            else if (r0_1 == 0xcdcdcdcd)
                int32_t r10_5 = *(r5 + 0x5e0)
                
                if (r10_5 == 0)
                    int32_t r0_126 = operator new(0x18)
                    r10_5 = r0_126
                    NetworkChatList::NetworkChatList(r0_126)
                    *(r5 + 0x5e0) = r10_5
                
                result = 1
                
                if (zx.d(*(arg2 + 0xa)) != 0)
                    int32_t r6_9 = 1
                    uint32_t r9_6 = zx.d(*(arg2 + 8))
                    void* r4_15 = &arg2[0xc]
                    
                    while (true)
                        void* r5_10 = zx.d(*(r4_15 + 8))
                        
                        if (r5_10 != 0)
                            r5_10 += &arg2[0xc]
                        
                        void* var_464_3 = r5_10
                        void* var_45c_2 = &arg2[0xc + zx.d(*(r4_15 + 6))]
                        NetworkChatList::AddChatMessage(r10_5, *r4_15, r9_6 & 0xffff, 
                            *(r4_15 + 0xa), (*(r4_15 + 0xe)).w, zx.d(*(r4_15 + 4)))
                        
                        if (r6_9 u>= zx.d(*(arg2 + 0xa)))
                            break
                        
                        r4_15 += 0x14
                        r6_9 += 1
                        r9_6 += 1
                        r10_5 = *(r5 + 0x5e0)
                    
                    result = 1
            else if (r0_1 != 0xd0d0d0d0)
            label_184390_1:
                result = 1
            else
                if (*(arg2 + 0x30) == 6)
                    printf("   --- open game %d\n", *(arg2 + 8))
                    int32_t* r0_43 = operator new(0xa2c)
                    __aeabi_memclr4(&r0_43[3], 0xa20)
                    r0_43[0x3e] = 3
                    int32_t r7_3 = 0x800
                    int32_t r0_45 = *(arg2 + 8)
                    int32_t r2_14 = *(arg2 + 0x10)
                    int32_t r5_2 = 0x80
                    *r0_43 = *(arg2 + 0xc)
                    r0_43[1] = r0_45
                    r0_43[2] = r2_14
                    int32_t r4_5 = *(arg2 + 0x1c)
                    r0_43[0x3d] = *(arg2 + 0x18)
                    r0_43[0x47] = 0
                    r0_43[0x48] = 0
                    r0_43[0x43] = 0
                    
                    do
                        r5_2 += 0x80
                        r7_3 += 0x800
                    while (r4_5 s>= r5_2)
                    
                    uint32_t r0_47
                    int32_t r1_17
                    r1_17:r0_47 = mulu.dp.d(r5_2, 0x10)
                    
                    if (r1_17 != 0)
                        r1_17 = 1
                    
                    if (r1_17 != 0)
                        r0_47 = 0xffffffff
                    
                    int32_t r0_48 = operator new[](r0_47)
                    __aeabi_memclr4(r0_48, r7_3)
                    r0_43[0x43] = r4_5
                    r0_43[0x44] = 0xffffffff
                    r0_43[0x46] = 0
                    r0_43[7] = r5_2
                    r0_43[8] = r0_48
                    
                    if (r4_5 == 0)
                        r0_43[0x45] = 0xffffffff
                    
                    r0_43[0x80] = 0xffffffff
                    int32_t r1_19 = *(arg2 + 0x24)
                    int32_t r2_16 = *(arg2 + 0x28)
                    int32_t r3_9 = *(arg2 + 0x2c)
                    r0_43[0x283] = *(arg2 + 0x20)
                    r0_43[0x285] = r1_19
                    r0_43[0x289] = r2_16
                    
                    if (r3_9 != 0)
                        int32_t r0_50 = operator new(0x18)
                        NetworkChatList::NetworkChatList(r0_50)
                        r0_43[0x28a] = r0_50
                        *(arg2 + 0x2c)
                        NetworkChatList::SetLastChatMessageIndex(r0_50)
                    
                    int32_t r0_52 = *(arg2 + 0x34)
                    *(r0_43 + 0x12) = *(arg2 + 0x38)
                    *(r0_43 + 0xe) = r0_52
                    NetworkClientManager::InsertGameData(r5)
                    r0_54 = *(r5 + 0xdc)
                    r1_24 = *(r5 + 0xe0)
                    goto label_1841e0
                
                puts("   --- parameter size mismatch")
                result = 1
        else if (r0_1 s<= 0xfdfdfdfc)
            if (r0_1 == 0xf7f7f7f7)
                printf("received create game reply (resultCode: %d)\n", *(arg2 + 8))
                i_3 = *(arg2 + 8)
                *(r5 + 0x98) = i_3
                
                if (*__stack_chk_guard != r0)
                    __stack_chk_fail()
                    noreturn
                
                return OutputNetworkEvent(8, i_3) __tailcall
            
            result = 1
            
            if (r0_1 == 0xf8f8f8f8)
                printf("received join game reply (Code: %d)\n", *(arg2 + 8))
                i_3 = *(arg2 + 8)
                *(r5 + 0x9c) = i_3
                
                if (*__stack_chk_guard != r0)
                    __stack_chk_fail()
                    noreturn
                
                return OutputNetworkEvent(9, i_3) __tailcall
        else
            if (r0_1 == 0xfdfdfdfd)
                printf("   --- delete game %d\n", *(arg2 + 8))
                int32_t* r1_53 = *(r5 + 0xdc)
                void* r0_116 = *(r5 + 0xe0)
                
                if (r0_116 != r1_53)
                    int32_t r2_27 = *(arg2 + 8)
                    void* r6_8
                    
                    if (*(*r1_53 + 4) != r2_27)
                        bool cond:8_1
                        
                        do
                            if (r0_116 - 4 == r1_53)
                                goto label_184544
                            
                            r6_8 = &r1_53[1]
                            cond:8_1 = *(r1_53[1] + 4) != r2_27
                            r1_53 = r6_8
                        while (cond:8_1)
                    else
                        r6_8 = r1_53
                    
                    int32_t* r0_172 = *(r5 + 0xf8)
                    
                    if (r0_172 == *(r5 + 0xfc))
                        std::__ndk1::vector<AppWorldData*, std::__ndk1::allocator<AppWorldData*> >::__push_back_slow_path<AppWorldData* const&>(
                            r5 + 0xf4)
                    else
                        *r0_172 = *r6_8
                        *(r5 + 0xf8) += 4
                    
                    int32_t r0_182 = *(r5 + 0xe0)
                    
                    if (r0_182 != r6_8 + 4)
                        __aeabi_memmove4(r6_8)
                    
                    r0_116 = r6_8 + ((r0_182 - (r6_8 + 4)) s>> 2 << 2)
                    *(r5 + 0xe0) = r0_116
                
            label_184544:
                int32_t* i_4 = *(r5 + 0xe8)
                int32_t r3_29 = *(r5 + 0xec)
                
                if (r3_29 != i_4)
                    int32_t r2_45 = *(arg2 + 8)
                    void* i_8
                    void* r7_18
                    
                    if (*(*i_4 + 4) != r2_45)
                        r7_18 = r5
                        
                        while (r3_29 - 4 != i_4)
                            i_8 = &i_4[1]
                            bool cond:11_1 = *(i_4[1] + 4) != r2_45
                            i_4 = i_8
                            
                            if (not(cond:11_1))
                                goto label_18459c
                        
                        r5 = r7_18
                    else
                        r7_18 = r5
                        i_8 = i_4
                    label_18459c:
                        int32_t* r0_184 = *(r7_18 + 0xf8)
                        
                        if (r0_184 == *(r7_18 + 0xfc))
                            std::__ndk1::vector<AppWorldData*, std::__ndk1::allocator<AppWorldData*> >::__push_back_slow_path<AppWorldData* const&>(
                                r7_18 + 0xf4)
                        else
                            *r0_184 = *i_8
                            *(r7_18 + 0xf8) += 4
                        
                        int32_t r0_188 = *(r7_18 + 0xec)
                        
                        if (r0_188 != i_8 + 4)
                            __aeabi_memmove4(i_8)
                        
                        r0_116 = *(r7_18 + 0xe0)
                        r5 = r7_18
                        *(r7_18 + 0xec) = i_8 + ((r0_188 - (i_8 + 4)) s>> 2 << 2)
                
                if (*__stack_chk_guard != r0)
                    __stack_chk_fail()
                    noreturn
                
                r0_149 = r0_116 - *(r5 + 0xdc)
            label_184620:
                return OutputNetworkEvent(6, r0_149 s>> 2) __tailcall
            
            if (r0_1 == 0x1001)
                puts("   --- end available game list")
                AvailableGame** r0_117 = *(r5 + 0xd0)
                AvailableGame** r1_54 = *(r5 + 0xd4)
                *(r5 + 0xcf) = 0
                str = NetworkClientManager::SortAvailableGamesByOnlineStatus
                std::__ndk1::__sort<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                    r0_117, r1_54, &str)
                result = OutputNetworkEvent(5, (*(r5 + 0xd4) - *(r5 + 0xd0)) s>> 2)
            else if (r0_1 != 0x1002 || zx.d(*(r5 + 0xcf)) == 0)
            label_184390_2:
                result = 1
            else if (*(arg2 + 0xd8) != 6)
                puts("   --- parameter size mismatch")
                result = 1
            else
                int32_t r0_5 = sprintf(&str, "(%d/%d)", sx.d(arg2[0xd]), sx.d(arg2[0xc]))
                uint32_t r1_1 = sx.d(arg2[0xd])
                int32_t r4_1
                int32_t i_5
                
                if (r1_1 s<= 0)
                    r4_1 = r0_5 + 3
                    *(&str + r0_5) = 0x2d203a
                    i_5 = 1
                else
                    int32_t r0_7 = sprintf(&str + r0_5, ": %s", &arg2[0x18])
                    r1_1 = sx.d(arg2[0xd])
                    r4_1 = r0_7 + r0_5
                    i_5 = 1
                    
                    if (r1_1 s>= 2)
                        void* r7 = &arg2[0x48]
                        i_5 = 1
                        
                        do
                            int32_t r0_9 = sprintf(&str + r4_1, "/%s", r7)
                            r1_1 = zx.d(arg2[0xd])
                            r4_1 += r0_9
                            r7 += 0x30
                            i_5 += 1
                        while (i_5 s< r1_1 << 0xfffffffc s>> 0x18)
                
                int32_t r1_97 = r1_1 << 0xfffffffc s>> 0x18
                int32_t r0_192 = sx.d(arg2[0xc])
                
                if (i_5 s< r0_192)
                    void* r2_50 = &str + r4_1
                    
                    do
                        *r2_50 = 0x2d2f
                        i_5 += 1
                        r2_50 += 2
                        *r2_50 = 0
                    while (i_5 s< r0_192)
                
                int32_t r0_193 = 0
                int32_t r2_51 = 0
                void* r8_5 = &arg2[0x10]
                
                if (r1_97 s>= r0_192)
                    r0_193 = 1
                
                if (r1_97 s>= 1)
                    void* r6_12 = r8_5
                    
                    do
                        if (*r6_12 == *(r5 + 0xa4))
                            r0_193 = 1
                            break
                        
                        r2_51 += 1
                        r6_12 += 0x30
                    while (r2_51 s< r1_97)
                
                int32_t* r1_98 = *(r5 + 0xd0)
                int32_t r2_52 = *(r5 + 0xd4)
                
                if (r1_98 != r2_52)
                    do
                        int32_t* r7_20 = *r1_98
                        r1_98 = &r1_98[1]
                        
                        if (*r7_20 == *(arg2 + 8))
                            printf("   --- updating game %s\n", &str)
                            r7_20[1].b = arg2[0xc]
                            int32_t r0_207 = sx.d(arg2[0xd])
                            *(r7_20 + 5) = r0_207.b
                            *(r7_20 + 6) = arg2[0xe]
                            
                            if (r0_207 s>= 1)
                                void* r4_22 = &r7_20[0xc]
                                int32_t i_6 = 0
                                
                                do
                                    *(r4_22 - 0x28) = *r8_5
                                    *(r4_22 - 0x24) = *(r8_5 + 6)
                                    *(r4_22 - 0x20) = *(r8_5 + 4)
                                    strncpy(r4_22 - 0x1e, r8_5 + 8, 0x1f)
                                    *r4_22 = 0
                                    r4_22 += 0x34
                                    i_6 += 1
                                    r8_5 += 0x30
                                while (i_6 s< sx.d(arg2[0xd]))
                            
                            r7_20[0x36] = *(arg2 + 0xd0)
                            r7_20[0x38].w = *(arg2 + 0xe0)
                            r7_20[0x37] = *(arg2 + 0xdc)
                            goto label_184354_1
                    while (r2_52 != r1_98)
                
                if (r0_193 == 0)
                    printf("   --- adding game %s\n", &str, r2_52)
                    int32_t* r0_194 = operator new(0xe4)
                    __aeabi_memclr4(r0_194, 0xe4)
                    *r0_194 = *(arg2 + 8)
                    int32_t r0_196 = sx.d(arg2[0xc])
                    r0_194[1].b = r0_196.b
                    *(r0_194 + 5) = arg2[0xd]
                    *(r0_194 + 6) = arg2[0xe]
                    
                    if (r0_196 s>= 1)
                        void* r5_15 = &r0_194[0xc]
                        int32_t i_7 = 0
                        
                        do
                            *(r5_15 - 0x28) = *r8_5
                            *(r5_15 - 0x24) = *(r8_5 + 6)
                            *(r5_15 - 0x20) = *(r8_5 + 4)
                            strncpy(r5_15 - 0x1e, r8_5 + 8, 0x1f)
                            *r5_15 = 0
                            r5_15 += 0x34
                            i_7 += 1
                            r8_5 += 0x30
                        while (i_7 s< sx.d(arg2[0xc]))
                    
                    int32_t r2_53 = *(arg2 + 0xdc)
                    r0_194[0x38].w = *(arg2 + 0xe0)
                    r0_194[0x36] = *(arg2 + 0xd0)
                    r0_194[0x37] = r2_53
                    int32_t* var_43c_1 = r0_194
                    void** r0_203 = *(r5 + 0xd4)
                    
                    if (r0_203 == *(r5 + 0xd8))
                        std::__ndk1::vector<AvailableGame*, std::__ndk1::allocator<AvailableGame*> >::__push_back_slow_path<AvailableGame* const&>(
                            r5 + 0xd0)
                        result = 1
                    else
                        *r0_203 = r0_194
                        result = 1
                        *(r5 + 0xd4) += 4
                else
                    printf("   --- hiding game %s\n", &str, r2_52)
                label_184354_1:
                    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
